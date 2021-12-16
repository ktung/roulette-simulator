package com.ktung.simulator;

import com.ktung.game.bet.Red;
import com.ktung.game.bet.abs.Bet;
import com.ktung.game.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {

  private final Random random = new Random();
  private List<String> outputs = new ArrayList<>();


  private final List<Bet> bets = new ArrayList<>();

  public void addBet(Bet bet) {
    this.bets.add(bet);
  }

  public void showOdds() {
    bets.forEach(bet -> System.out.println(bet.getOddsMap()));
  }

  public int run(int nbPlay) {
    outputs.clear();
    int sumBet = bets.stream().map(Bet::getBet).reduce(0, Integer::sum);
    int totalBet = sumBet*nbPlay;
    int totalWon = 0;

    for (int i = 0; i < nbPlay; i++) {
      int result = random.nextInt(Constants.NB_POSSIBILITIES);

      int won = bets.stream().map(bet -> bet.calculateWin(result)).reduce(0, Integer::sum);
      totalWon += won;
      outputs.add(String.format("Result : %d, Bet : %d, Won : %d%n", result, sumBet, won));
    }
    int pnl = totalWon-totalBet;
    outputs.add(String.format("Bet : %d, Won : %d => P/L %d%n", totalBet, totalWon, pnl));
    System.out.println(outputs);

    return pnl;
  }

  public int run2(int balance, int maxRound, int initialBet, double limitWin) {
    boolean verbose = true;
    outputs.clear();
    int initialBalance = balance;
    int savings = 0;

    bets.clear();
    this.addBet(new Red(initialBet));

    for (int i = 0; i < maxRound && balance > 0; i++) {
      int sumBet = bets.stream().map(Bet::getBet).reduce(0, Integer::sum);

      int result = random.nextInt(Constants.NB_POSSIBILITIES);
//      int result = 1;
      int won = bets.stream().map(bet -> bet.calculateWin(result)).reduce(0, Integer::sum);
      balance += (won-sumBet);
      outputs.add(String.format("%d | Result : %d, Bet : %d, Won : %d | Balance %d%n", i, result, sumBet, won, balance));

      if (balance >= initialBalance*limitWin) {
        break;
      }

      if (won > 0) {
//        this.addBet(new Red(5));
        int saving = initialBet/2;
        if (savings >= 2*initialBalance) {
          savings /= 2;
        }
        savings += saving;
        int safeBet = won/2-savings;
        if (sumBet+safeBet <= 0) {
          if (verbose) {
            System.out.printf("No more safe bet %d%n", sumBet+safeBet);
          }
          break;
        }
        this.addBet(new Red(won/2-savings));
      } else {
        bets.clear();
        if ((balance-savings) >= initialBet) {
          this.addBet(new Red(initialBet));
        } else {
          break;
//          this.addBet(new Red(balance));
        }
      }
    }

    int pnl = balance-initialBalance;
    double pnlPercent = ((double)balance/initialBalance -1)*100;
    outputs.add(String.format("Bet : %d, Won : %d => P/L %d (%f%%) [savings %d]%n", initialBalance, balance, pnl, pnlPercent, savings));
    if (verbose) {
      System.out.println(outputs);
    }

    return pnl;
  }
}

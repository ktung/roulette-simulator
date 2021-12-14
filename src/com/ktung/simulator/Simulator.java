package com.ktung.simulator;

import com.ktung.game.Bet;
import com.ktung.game.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {

  private final List<Bet> bets = new ArrayList<>();

  public void addBet(Bet bet) {
    this.bets.add(bet);
  }

  public void showOdds() {
    bets.forEach(bet -> System.out.println(bet.getOddsMap()));
  }

  public int run(int nbPlay) {
    List<String> outputs = new ArrayList<>();

    int sumBet = bets.stream().map(Bet::getBet).reduce(0, Integer::sum);
    int totalBet = sumBet*nbPlay;
    int totalWon = 0;

    for (int i = 0; i < nbPlay; i++) {
      Random random = new Random();
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
}

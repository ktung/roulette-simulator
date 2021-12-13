package com.ktung.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Even extends Bet {
  private static final double odds = 18f/Constants.NB_POSSIBILITIES;
  private static final int payout = 1;
  private static final int[] winningNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};

  public Even(int bet) {
    this.bet = bet;
  }

  public int calculateWin(Integer result) {
    if (Arrays.stream(winningNumbers).anyMatch(result::equals)) {
      return bet + bet*payout;
    }

    return 0;
  }

  private int calculatePossibleWin() {
    return bet + bet*payout;
  }

  public Map<Double, Integer> getOdds() {
    Map<Double, Integer> odds = new HashMap<>();
    odds.put(Even.odds, calculatePossibleWin());
    odds.put(1-Even.odds, 0);
    return odds;
  }
}

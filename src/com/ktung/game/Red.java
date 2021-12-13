package com.ktung.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Red extends Bet {
  private static final double odds = 18f/Constants.NB_POSSIBILITIES;
  private static final int payout = 1;
  private static final int[] winningNumbers = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

  public Red(int bet) {
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
    odds.put(Red.odds, calculatePossibleWin());
    odds.put(1- Red.odds, 0);
    return odds;
  }
}

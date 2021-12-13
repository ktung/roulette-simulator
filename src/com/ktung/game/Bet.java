package com.ktung.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Bet {

  protected int[] winningNumbers;
  protected int payout;


  protected int bet;

  public double getOdds() {
    return (double) winningNumbers.length /Constants.NB_POSSIBILITIES;
  }

  protected int calculatePossibleWin() {
    return bet + bet*payout;
  }

  public Map<Double, Integer> getOddsMap() {
    Map<Double, Integer> odds = new HashMap<>();
    odds.put(this.getOdds(), calculatePossibleWin());
    odds.put(1-this.getOdds(), 0);
    return odds;
  }


  public int getBet() {
    return bet;
  }

  public int calculateWin(Integer result) {
    if (Arrays.stream(winningNumbers).anyMatch(result::equals)) {
      return bet + bet*payout;
    }

    return 0;
  }
}

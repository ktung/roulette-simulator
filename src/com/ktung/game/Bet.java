package com.ktung.game;

import java.util.Map;

public abstract class Bet {

  protected int bet;

  public abstract Map<Double, Integer> getOdds();

  public abstract int calculateWin(Integer result);

  public int getBet() {
    return bet;
  }
}

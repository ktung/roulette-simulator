package com.ktung.game.bet;

import com.ktung.game.bet.abs.Dozen;

public class ThirdDozen extends Dozen {
  public ThirdDozen(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = new int[]{25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
  }
}

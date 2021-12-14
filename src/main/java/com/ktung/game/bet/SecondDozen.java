package com.ktung.game.bet;

import com.ktung.game.bet.abs.Dozen;

public class SecondDozen extends Dozen {
  public SecondDozen(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = new int[]{13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
  }
}

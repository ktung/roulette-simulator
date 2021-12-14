package com.ktung.game.bet;

import com.ktung.game.bet.abs.Dozen;

public class FirstDozen extends Dozen {
  public FirstDozen(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  }
}

package com.ktung.game.bet;

import com.ktung.game.bet.abs.Column;

public class SecondColumn extends Column {
  public SecondColumn(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = new int[]{2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
  }
}

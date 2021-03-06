package com.ktung.game.bet;

import com.ktung.game.bet.abs.Column;

public class FirstColumn extends Column {
  public static final int[] winningNums = new int[]{1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};

  public FirstColumn(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = FirstColumn.winningNums;
  }
}

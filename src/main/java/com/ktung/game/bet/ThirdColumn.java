package com.ktung.game.bet;

import com.ktung.game.bet.abs.Column;

public class ThirdColumn extends Column {
  public static final int[] winningNums = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

  public ThirdColumn(int bet) {
    init();
    this.bet = bet;
  }

  protected void init() {
    this.winningNumbers = winningNums;
  }
}

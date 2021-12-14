package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Black extends Bet {
  public static final int[] winningNums = new int[]{2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

  public Black(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = Black.winningNums;
    this.payout = 1;
  }
}

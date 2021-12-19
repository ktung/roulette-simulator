package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class High extends Bet {
  public static final int[] winningNums = new int[]{19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

  public High(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = High.winningNums;
    this.payout = 1;
  }
}

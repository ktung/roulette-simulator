package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Low extends Bet {
  public static final int[] winningNums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

  public Low(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = Low.winningNums;
    this.payout = 1;
  }
}

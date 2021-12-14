package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Red extends Bet {
  public static final int[] winningNums = new int[]{1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

  public Red(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = Red.winningNums;
    this.payout = 1;
  }
}

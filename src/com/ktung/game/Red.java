package com.ktung.game;

public class Red extends Bet {
  public Red(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = new int[]{1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    this.payout = 1;
  }
}

package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Even extends Bet {

  public Even(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
    this.payout = 1;
  }

}

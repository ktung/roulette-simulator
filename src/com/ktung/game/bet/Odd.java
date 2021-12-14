package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Odd extends Bet {

  public Odd(int bet) {
    init();
    this.bet = bet;
  }

  private void init() {
    this.winningNumbers = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
    this.payout = 1;
  }

}

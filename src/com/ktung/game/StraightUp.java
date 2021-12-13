package com.ktung.game;

public class StraightUp extends Bet {
  public StraightUp(int bet) {
    init();
    this.bet = bet;
  }

  public StraightUp(int bet, int winningNumber) {
    this(bet);
    this.winningNumbers = new int[]{winningNumber};
  }

  private void init() {
    this.winningNumbers = new int[]{};
    this.payout = 35;
  }

}

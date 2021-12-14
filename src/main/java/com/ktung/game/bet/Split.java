package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

public class Split extends Bet {
  public Split(int bet, int firstNumber, int secondNumber) {
    this.bet = bet;
    this.winningNumbers = new int[]{firstNumber, secondNumber};
    this.payout = 17;
    this.validateBet();
  }

  private void validateBet() {
    if (winningNumbers.length != 2) {
      invalidBet();
      return;
    }

    int difference = Math.abs(winningNumbers[0]-winningNumbers[1]);
    if (difference != 1 && difference != 3) {
      invalidBet();
    }
  }

}

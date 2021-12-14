package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

import java.util.Arrays;

public class Street extends Bet {
  public Street(int bet, int firstNumber, int secondNumber, int thirdNumber) {
    this.bet = bet;
    this.winningNumbers = new int[]{firstNumber, secondNumber, thirdNumber};
    this.payout = 11;
    this.validateBet();
  }

  private void validateBet() {
    if (winningNumbers.length != 3) {
      invalidBet();
    }

    Arrays.sort(winningNumbers);
    for (int i = 0; i < winningNumbers.length - 2; i++) {
      if (winningNumbers[i+1] - winningNumbers[i] != 1) {
        invalidBet();
        return;
      }
    }
  }

}

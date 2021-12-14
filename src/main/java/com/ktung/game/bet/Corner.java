package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

import java.util.Arrays;

public class Corner extends Bet {
  public Corner(int bet, int... winningNumbers) {
    this.bet = bet;
    this.winningNumbers = winningNumbers;
    this.payout = 8;
    this.validateBet();
  }

  private void validateBet() {
    if (winningNumbers.length != 4) {
      invalidBet();
      return;
    }

    Arrays.sort(winningNumbers);
    if (winningNumbers[0] == 0 &&winningNumbers[1] == 1 && winningNumbers[2] == 2 && winningNumbers[3] == 3) {
      return;
    }

    if ((winningNumbers[2] - winningNumbers[1]) != 0) {
      invalidBet();
      return;
    }
    if ((winningNumbers[0] + winningNumbers[3]) - (winningNumbers[1]+winningNumbers[2]) != 0) {
      invalidBet();
    }
  }
}

package com.ktung.game.bet;

import com.ktung.game.bet.abs.Bet;

import java.util.Arrays;

public class Line extends Bet {
  public Line(int bet, int... winningNumbers) {
    this.bet = bet;
    this.winningNumbers = winningNumbers;
    this.payout = 5;
    this.validateBet();
  }

  private void validateBet() {
    if (winningNumbers.length != 6) {
      invalidBet();
    }

    Arrays.sort(winningNumbers);
    for (int i = 0; i < winningNumbers.length - 1; i++) {
      if (winningNumbers[i+1] - winningNumbers[i] != 1) {
        invalidBet();
        return;
      }
    }

    int nbRed = 0;
    for (int i = 0; i < winningNumbers.length-1; i++) {
      int currentNumber = winningNumbers[i];
      if (Arrays.stream(Red.winningNums).anyMatch(n -> n == currentNumber)) {
        ++nbRed;
      }
    }

    if (nbRed != 3) {
      invalidBet();
    }
  }
}

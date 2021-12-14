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
      return;
    }

    Arrays.sort(winningNumbers);
    for (int i = 0; i < winningNumbers.length - 1; i++) {
      if (winningNumbers[i+1] - winningNumbers[i] != 1) {
        invalidBet();
        return;
      }
    }

    if (Arrays.stream(FirstColumn.winningNums).noneMatch(n -> n == winningNumbers[0])) {
      invalidBet();
      return;
    }

    if (Arrays.stream(SecondColumn.winningNums).noneMatch(n -> n == winningNumbers[1])) {
      invalidBet();
      return;
    }

    if (Arrays.stream(ThirdColumn.winningNums).noneMatch(n -> n == winningNumbers[2])) {
      invalidBet();
    }
  }

}

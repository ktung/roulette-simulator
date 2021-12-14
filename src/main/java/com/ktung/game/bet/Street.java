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

    int nbWrongColor = 0;
//    if (Arrays.stream(Red.redNumbers).anyMatch(n -> n == winningNumbers[0])) {
//      for (int i = 1; i < winningNumbers.length-1; i++) {
//        if (Arrays.stream(Black.blackNumbers).anyMatch(n -> n == winningNumbers[i])) {
//          ++nbWrongColor;
//        }
//      }
//    } else if (Arrays.stream(Black.blackNumbers).anyMatch(n -> n == winningNumbers[0])) {
//      for (int i = 1; i < winningNumbers.length - 1; i++) {
//        if (Arrays.stream(Red.redNumbers).anyMatch(n -> n == winningNumbers[i])) {
//          ++nbWrongColor;
//        }
//      }
//    }
//
//    if (nbWrongColor == 2) {
//      invalidBet();
//    }
  }

}

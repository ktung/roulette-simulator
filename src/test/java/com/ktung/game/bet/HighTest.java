package com.ktung.game.bet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighTest {

  @Test
  public void highTest() {
    High high = new High(1);
    assertEquals(18d/37, high.getOdds());
    assertEquals(2, high.calculateWin(19));
  }
}

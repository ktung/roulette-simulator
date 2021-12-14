package com.ktung.game.bet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackTest {

  @Test
  public void blackTest() {
    Black black = new Black(1);
    assertEquals(18d/37, black.getOdds());
  }
}

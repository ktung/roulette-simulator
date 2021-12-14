package com.ktung.game.bet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CornerTest {

  @Test
  public void valid() {
    Corner corner = new Corner(1, 1, 2, 4, 5);
    assertEquals(4d/37, corner.getOdds());
    assertEquals(9, corner.calculateWin(1));
  }

  @Test
  public void not_enough_number() {
    Corner corner = new Corner(1, 1, 2, 3);
    assertEquals(0, corner.getOdds());
    assertEquals(0, corner.calculateWin(1));
    assertEquals(0, corner.calculateWin(2));
  }

  @Test
  public void too_many_number() {
    Corner corner = new Corner(1, 1, 2, 3, 4, 5);
    assertEquals(0, corner.getOdds());
    assertEquals(0, corner.getBet());
    assertEquals(0, corner.calculateWin(2));
  }

  @Test
  public void invalid_number() {
    Corner corner = new Corner(1, 1, 2, 5, 6);
    assertEquals(0, corner.getOdds());
    assertEquals(0, corner.getBet());
    assertEquals(0, corner.calculateWin(2));
  }

  @Test
  public void zero_corner() {
    Corner corner = new Corner(1, 0, 1, 2, 3);
    assertEquals(4d/37, corner.getOdds());
    assertEquals(9, corner.calculateWin(1));
  }

}

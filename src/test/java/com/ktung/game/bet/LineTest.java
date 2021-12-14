package com.ktung.game.bet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

  @Test
  public void valid() {
    Line line = new Line(1, 1, 2, 3, 4, 5, 6);
    assertEquals(6d/37, line.getOdds());
    assertEquals(6, line.calculateWin(1));
  }

  @Test
  public void not_enough_number() {
    Line line = new Line(1, 2, 20, 3, 2, 10);
    assertEquals(0, line.getOdds());
    assertEquals(0, line.getBet());
    assertEquals(0, line.calculateWin(2));
  }

  @Test
  public void too_many_number() {
    Line line = new Line(1, 2, 20, 3, 2, 10, 3, 2, 11);
    assertEquals(0, line.getOdds());
    assertEquals(0, line.getBet());
    assertEquals(0, line.calculateWin(2));
  }

  @Test
  public void invalid_number() {
    Line line = new Line(1, 2, 20, 3, 2, 10, 20);
    assertEquals(0, line.getOdds());
    assertEquals(0, line.getBet());
    assertEquals(0, line.calculateWin(2));
  }

  @Test
  public void invalid_sequence() {
    Line line = new Line(1, 3, 4, 5);
    assertEquals(0, line.getOdds());
    assertEquals(0, line.getBet());
    assertEquals(0, line.calculateWin(2));
  }
}

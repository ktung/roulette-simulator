package com.ktung.game.bet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreetTest {

  @Test
  public void valid() {
    Street street = new Street(1, 1, 2, 3);
    assertEquals(3d/37, street.getOdds());
    assertEquals(12, street.calculateWin(1));
  }

  @Test
  public void invalid_number_column() {
    Street street = new Street(1, 2, 20, 3);
    assertEquals(0, street.getOdds());
    assertEquals(0, street.getBet());
    assertEquals(0, street.calculateWin(2));
  }

  @Test
  public void invalid_number() {
    Street street = new Street(1, 4, 5, 15);
    assertEquals(0, street.getOdds());
    assertEquals(0, street.getBet());
    assertEquals(0, street.calculateWin(2));
  }

  @Test
  public void invalid_sequence() {
    Street street = new Street(1, 3, 4, 5);
    assertEquals(0, street.getOdds());
    assertEquals(0, street.getBet());
    assertEquals(0, street.calculateWin(2));
  }
}

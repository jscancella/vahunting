package com.github.vaHunting.domain;

import java.time.LocalDateTime;

/**
 * Used to represent the input needed for a query of all the rules for a particular date (day)
 */
public class Query {
  public final LocalDateTime day;
  public final GameAnimal animal;
  public final Weapon weapon;
  public final Location location;
  
  public Query(final LocalDateTime day, final GameAnimal animal, final Weapon weapon, final Location location) {
    this.day = day;
    this.animal = animal;
    this.weapon = weapon;
    this.location = location;
  }  
}

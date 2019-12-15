package com.github.vaHunting.domain;

import java.time.LocalDateTime;
import java.util.Set;

public abstract class GameAnimal {
  public abstract Season getSeason(Location location, Weapon weapon);
  
  public final Set<Restriction> getRestrictions(LocalDateTime day, Location location, Weapon weapon){
    Set<Restriction> restrictions = getSpecificRestrictions(day, location, weapon);
    //TODO add generic ones
    return restrictions;
  }
  public abstract Set<Restriction> getSpecificRestrictions(LocalDateTime day, Location location, Weapon weapon);
}

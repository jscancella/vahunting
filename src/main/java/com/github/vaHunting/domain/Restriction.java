package com.github.vaHunting.domain;

//example, can only use .22 or small rifle in PWC
public class Restriction {
  public final String name; // shorthand name for restriction rule
  public final String description; //human readable rule
  public final String source; //where in the regulations it comes from
  
  public Restriction(final String name, final String description, final String source) {
    this.name = name;
    this.description = description;
    this.source = source;
  }
}

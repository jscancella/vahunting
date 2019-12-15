package com.github.vaHunting.domain;

import java.time.LocalDateTime;
import java.util.Set;

public class Season {
  public final Set<LocalDateTime> days;
  
  public Season(final Set<LocalDateTime> days) {
    this.days = days;
  }
}

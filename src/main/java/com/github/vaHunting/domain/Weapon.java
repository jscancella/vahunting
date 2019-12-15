package com.github.vaHunting.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Is any weapon allowable for hunting as defined in 29.1-519 of the Code of Virginia(see https://law.lis.virginia.gov/vacode/title29.1/chapter5/section29.1-519/).
 * pulled from https://www.dgif.virginia.gov/hunting/regulations/definitions/
 */
public enum Weapon {
  shotgun(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM, WeaponType.CENTERFIRE, WeaponType.MUZZLELOADER))),
  rimfire_rifle(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM, WeaponType.RIMFIRE))),
  centerfire_rifle(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM, WeaponType.CENTERFIRE))),
  muzzleloading_rifle(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM))),
  air_rifle(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM, WeaponType.AIR_GUN))),
  bow_and_arrow(new HashSet<>(Arrays.asList(WeaponType.ARCHARY))),
  crossbow(new HashSet<>(Arrays.asList(WeaponType.ARCHARY))),
  slingbow(new HashSet<>(Arrays.asList(WeaponType.ARCHARY))),
  arrowgun(new HashSet<>(Arrays.asList(WeaponType.RIFLE, WeaponType.FIREARM))), //with special permission - must be disabled and can't draw weight of bow or crossbow. see https://law.lis.virginia.gov/vacode/29.1-306/
  slingshot(new HashSet<>(Arrays.asList(WeaponType.ARCHARY))),
  rimfire_pistol(new HashSet<>(Arrays.asList(WeaponType.FIREARM, WeaponType.PISTOL, WeaponType.RIMFIRE))),
  centerfire_pistol(new HashSet<>(Arrays.asList(WeaponType.FIREARM, WeaponType.PISTOL, WeaponType.CENTERFIRE))),
  muzzleloading_pistol(new HashSet<>(Arrays.asList(WeaponType.FIREARM, WeaponType.MUZZLELOADER, WeaponType.PISTOL))),
  revolver(new HashSet<>(Arrays.asList(WeaponType.FIREARM, WeaponType.PISTOL, WeaponType.CENTERFIRE, WeaponType.RIMFIRE))),
  fully_automatic(new HashSet<>(Arrays.asList(WeaponType.FIREARM)));
  
  private final Set<WeaponType> types;
  
  private Weapon(final Set<WeaponType> types) {
    this.types = types;
  }
  
  public boolean isType(final WeaponType type) {
    return types.contains(type);
  }
}

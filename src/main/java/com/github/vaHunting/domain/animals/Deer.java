package com.github.vaHunting.domain.animals;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.github.vaHunting.domain.GameAnimal;
import com.github.vaHunting.domain.Location;
import com.github.vaHunting.domain.Restriction;
import com.github.vaHunting.domain.Season;
import com.github.vaHunting.domain.Weapon;
import com.github.vaHunting.domain.WeaponType;

public class Deer extends GameAnimal {
  private static final Set<Location> EAB_LOCATIONS = new HashSet<>(Arrays.asList(
      Location.Albemarle,
      Location.Bedford,
      Location.Culpeper,
      Location.Fauquier,
      Location.Floyd,
      Location.Franklin,
      Location.Grayson,
      Location.Hanover,
      Location.Henrico,
      Location.James_city,
      Location.Montgomery,
      Location.Pulaski,
      Location.Rappahannock,
      Location.Roanoke,
      Location.Shenandoah,
      Location.York,
      Location.Clarke,
      Location.Frederick,
      Location.Warren,
      Location.Arlington,
      Location.Fairfax,
      Location.Loudoun,
      Location.Prince_William));
  
  @Override
  public Season getSeason(Location location, Weapon weapon){
    // TODO Auto-generated method stub
    //add in from https://www.dgif.virginia.gov/hunting/regulations/deer/
    return null;
  }

  @Override
  public Set<Restriction> getSpecificRestrictions(LocalDateTime day, Location location, Weapon weapon){
    Set<Restriction> deerSpecificRestrictions = new HashSet<>();
    //TODO add in from https://www.dgif.virginia.gov/hunting/regulations/deer/
    
    if(weapon.isType(WeaponType.RIMFIRE)) {
      deerSpecificRestrictions.add(new Restriction("no rimfire", "Not allowed to use rimfire for deer hunting.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
    }
    
    if(weapon.isType(WeaponType.RIFLE)) {
      if(weapon.isType(WeaponType.CENTERFIRE)){
        deerSpecificRestrictions.add(new Restriction("caliber", "Rifles using centerfire ammunition must be .23 caliber or LARGER", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
      }
    }
    
    if(weapon.isType(WeaponType.PISTOL)) {
      if(weapon.isType(WeaponType.CENTERFIRE)){
        deerSpecificRestrictions.add(new Restriction("caliber", "pistols using centerfire ammunition must be .23 caliber or LARGER and generate at least 350 foot pounds of energy or greater.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
      }
    }
    
    if(weapon.isType(WeaponType.FIREARM)){
      deerSpecificRestrictions.add(new Restriction("no dogs on sunday", "The hunting of deer or bear with a gun, firearm, or other weapon with the aid or assistance of dogs on Sunday is prohibited.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Hunting With Dogs section"));
    }
    
    if(weapon.isType(WeaponType.MUZZLELOADER)) {
      deerSpecificRestrictions.add(new Restriction("No blaze once in position", "During the muzzleloader seasons for hunting deer with a muzzleloading firearm, every muzzleloader deer hunter and every person accompanying a muzzleloader deer hunter shall wear solid blaze colors as specified above except when they are physically located in a tree stand or other stationary hunting location.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Blaze Colored Requirements section"));
      deerSpecificRestrictions.add(new Restriction("caliber", "Muzzleloading firearms – rifles and pistols must be .45 caliber or LARGER", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
    }
    
    if(weapon.isType(WeaponType.ARCHARY)) {
      deerSpecificRestrictions.add(new Restriction("archary exemption from blaze", "Hunters hunting with archery tackle during an open firearms deer season in areas where the discharge of firearms is prohibited by state law or local ordinance are exempt from the blaze color requirement.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Blaze Colored Requirements Exceptions section"));
      deerSpecificRestrictions.add(new Restriction("size", "Archery equipment with broadhead widths/expandables that open to 7/8-inch", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
    }
    
    if(weapon.isType(WeaponType.AIR_GUN)) {
      deerSpecificRestrictions.add(new Restriction("air gun caliber", "Air guns must be .35 caliber or LARGER", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
    }
    
    if(Weapon.shotgun.equals(weapon)) {
      deerSpecificRestrictions.add(new Restriction("shot size", "Shotguns (including muzzleloading shotguns) using ammunition loaded with larger than number 2 fine shot", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle table"));
      deerSpecificRestrictions.add(new Restriction("unplugged", "Shotgun may be unplugged", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Legal Use of Firearms and Archery Tackle section"));
    }
    
    deerSpecificRestrictions.add(new Restriction("tracking dogs find wounded deer", "Tracking dogs maintained and controlled on a lead may be used to find a wounded or dead bear, deer, or turkey statewide during any archery, muzzleloader, or firearm season for these species, or within 24 hours of the end of such season, provided that those who are involved in the retrieval effort have permission to hunt on or to access the land being searched. Licensed hunters engaged in such tracking may possess any weapon permitted for hunting and may use such weapon to humanely kill the wounded bear, deer, or turkey being tracked, including after legal hunting hours. Such weapon shall not be used to hunt, wound, or kill any animal other than the animal being tracked, except in self-defense.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Hunting With Dogs section"));
    deerSpecificRestrictions.add(new Restriction("bought and sold", "The hair, hide, tail, sinew, skull, antlers, bones, and feet as well as products made from these parts may be bought and sold.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Sale and Purchase of Legally Harvested Game Species deer and elk section"));
    deerSpecificRestrictions.add(new Restriction("boat", "Unlawful to kill or attempt to kill any deer while in a boat or other type of watercraft.", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Other Weapons Usage section"));
    
    //TODO time specific
//    September 1 – first Saturday in January; statewide
//    During any open deer or elk season; statewide
//    Year round in Albemarle, Buchanan, Clarke, Culpeper, Dickenson, Fauquier, Frederick, Greene, Loudoun, Louisa, Madison, Orange, Page, Rappahannock, Rockingham, Shenandoah, Spotsylvania, Stafford, Warren, and Wise counties (towns and cities within included).
    deerSpecificRestrictions.add(new Restriction("feeding", "Department regulation makes it illegal to place, distribute, or allow the placement of food, minerals, salt, carrion, trash, or similar substances to feed or attract deer at this time", "https://www.dgif.virginia.gov/hunting/regulations/general/ under Unlawful Feeding of Certain Wildlife section"));
    
    if(isEarnABuckLocation(location)) {
      deerSpecificRestrictions.add(new Restriction("EAB", "Earn A Buck (EAB) is available in this location. See https://www.dgif.virginia.gov/hunting/regulations/general/ Earn A Buck (EAB) Questions and Answers for more information", "https://www.dgif.virginia.gov/hunting/regulations/general/ Earn A Buck (EAB) Questions and Answers section"));
      if(Location.Prince_William.equals(location)) {
        deerSpecificRestrictions.add(new Restriction("not on deparment lands", "EAB does not apply to Department of Defense (DOD) lands in Prince William County.", "Earn A Buck (EAB) Questions and Answers under How does EAB work section"));
      }
    }
    
    return deerSpecificRestrictions;
  }
  
  private boolean isEarnABuckLocation(final Location location) {
    return EAB_LOCATIONS.contains(location);
  }
}

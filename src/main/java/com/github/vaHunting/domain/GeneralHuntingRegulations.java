package com.github.vaHunting.domain;

import java.util.HashSet;
import java.util.Set;

public enum GeneralHuntingRegulations {
  //sunday hunting section
  PRIVATE_LAND_SUNDAY("Any landowner or member of his family or any person with written permission from the landowner may hunt on"
      + " the landowner’s property on Sunday, except within 200 yards of a place of worship or any accessory structure thereof."),
  SHOOTING_PRESERVES_SUNDAY("Hunting is permitted on licensed hunting (shooting) preserves."),
  NO_HUNTING_SUNDAY("Other than other exceptions and other allowances that had been made specifically by law in the past, "
      + "it will continue to be unlawful to hunt or kill any wild bird or wild animal, "
      + "including any nuisance species, with a gun, firearm, or other weapon on Sundays."),
  NO_DOGS_SUNDAY("It is unlawful to hunt or kill any deer or bear with a gun, firearm, or other weapon with the aid or assistance of dogs on Sundays"),
  //blaze requirements section
  BLAZE_AMOUNT_AND_DISPLAY("Every hunter (see exceptions below), or persons accompanying a hunter, shall wear a solid blaze colored "
      + "(blaze orange or blaze pink) hat or solid blaze colored upper body clothing that is visible from 360 degrees or display at "
      + "least 100 square inches of solid blaze colored material at shoulder level within body reach and visible from 360 degrees."), //TODO account for exceptions
  BLAZE_HAT("Hats may have a bill or brim color or design other than solid blaze color. Hats shall not be in “camo” style, "
      + "since the latter is designed to prevent visibility. A logo, which does not detract from visibility, may be worn on a blaze colored hat."),
  BLAZE_BLIND("Hunters using an enclosed ground (pop-up, chair, box, etc.) that conceals them from view shall display at least 100 square inches "
      + "of solid blaze colored material, visible from 360 degrees attached to or immediately above the blind. This blaze color is in addition to "
      + "any worn on the hunter’s person. During the muzzleloader seasons for hunting deer with a muzzleloading firearm, every muzzleloader deer "
      + "hunter and every person accompanying a muzzleloader deer hunter shall wear solid blaze colors as specified above except when they are "
      + "physically located in a tree stand or other stationary hunting location."),
  //hunting with dogs section
  DOGS_PURSUING_GAME("Dogs may be used to pursue wild birds and animals during hunting seasons where not prohibited."),
  DOG_RETRIEVAL("Section 18.2-136 of the Code of Virginia decriminalizes trespass in certain instances related to dog retrieval. "
      + "That section provides: \"Fox hunters and coon hunters, when the chase begins on other lands, may follow their dogs on prohibited lands, "
      + "and hunters of all other game, when the chase begins on other lands, may go upon prohibited lands to retrieve their dogs, falcons, hawks, "
      + "or owls, but may not carry firearms or bow and arrows on their person or hunt any game while thereon. The use of vehicles to retrieve dogs, "
      + "falcons, hawks, or owls on prohibited lands shall be allowed only with the permission of the landowner or his agent. Any person who goes on "
      + "prohibited lands to retrieve his dogs, falcons, hawks, or owls pursuant to this section and who willfully refuses to identify himself when "
      + "requested by the landowner or his agent to do so is guilty of a Class 4 misdemeanor.\""),
  DOGS_TRACKING("Tracking dogs maintained and controlled on a lead may be used to find a wounded or dead bear, deer, or turkey statewide during any "
      + "archery, muzzleloader, or firearm season for these species, or within 24 hours of the end of such season, provided that those who are involved "
      + "in the retrieval effort have permission to hunt on or to access the land being searched. Licensed hunters engaged in such tracking may possess "
      + "any weapon permitted for hunting and may use such weapon to humanely kill the wounded bear, deer, or turkey being tracked, including after "
      + "legal hunting hours. Such weapon shall not be used to hunt, wound, or kill any animal other than the animal being tracked, except in self-defense."),
  DOGS_ARCHARY("It is unlawful to use dogs when hunting any species with archery tackle during any archery season, "
      + "except bear hounds may be used during the youth/apprentice bear hunting weekend."),
  DOGS_BAIT("It is unlawful to chase with dogs or hunt with dogs or to attempt to chase or hunt with dogs any wild animal from a baited site or to train "
      + "dogs on any wild animal from a baited site. Furthermore, it shall be unlawful to place, distribute, or maintain bait or salt for any wild animal "
      + "for the purpose of chasing with dogs, hunting with dogs, or training of dogs. When hunting or training with dogs, a baited site will be considered "
      + "to be baited for 10 days following the complete removal of all such bait or salt."),
  DOGS_CRIPPLE("It is unlawful to intentionally cripple or otherwise harm any game animal for the intent of continuing a hunt, or chase, or for the purpose "
      + "of training dogs. Upon treeing, baying, or otherwise containing an animal in a manner that offers the animal no avenue of escape, the person or "
      + "the hunting party shall either harvest the animal if within a legal take season and by using lawful methods of take or terminate the chase by "
      + "retrieving the dogs and allowing the animal freedom to escape for the remainder of the same calendar day."),
  DOGS_DISLODGE("It is unlawful to dislodge an animal from a tree for the intent of continuing a hunt, or chase, or for the purpose of training dogs."),
  //training dogs section
  DOGS_TRAINING("The training of dogs on live wild animals is considered hunting and you must have a valid hunting license while training; "
      + "it is unlawful during the closed season except as noted below"),//TODO account for exceptions
  //Sale and Purchase of Legally Harvested Game Species section
  BUY_SELL_BARTER("It is unlawful to sell, barter, or purchase any wild bird or wild animal carcass or parts thereof. "
      + "There are exceptions and a general representation of these are listed below for your reference and is not intended to be all-inclusive. "
      + "Specific exceptions and requirements are identified in the Code of Virginia and the Virginia Administrative Code."), //TODO account foe exceptions
  //  Unlawful Methods section
  HOLD_CAPTIVE("It is unlawful to hold in captivity any live wild birds or wild animals outside the limits allowed by regulations without a permit."),
  FOREST_FIRE("It is unlawful to hunt adjacent to forest fires."),
  ANTLER_TRAP("It is unlawful to use antler traps."),
  IMPEDE_HUNTING_TRAPPING("It is unlawful to willfully and intentionally impede the lawful hunting or trapping of wild birds or wild animals."),
  CRIPPLE_OR_WASTE("It is unlawful to kill or cripple and knowingly allow any nonmigratory game bird or game animal to be wasted without making a reasonable effort to retrieve the animal and retain it in possession."),
  UNDER_THE_INFLUENCE("It is unlawful to hunt while under the influence of intoxicants or narcotic drugs."),
  ELECTRONIC_CALLS("It is unlawful to take or attempt to take wild animals and wild birds by the use or aid of recorded animal or bird calls or sounds or recorded or electrically amplified imitation of animals or bird calls or sounds; provided, that electronic calls may be used on private lands for hunting bobcats, coyotes, raccoons, and foxes with written permission of the landowner and on public lands except where specifically prohibited."),
  MOLEST_YOUNG("It is unlawful to molest nest, eggs, den, or young of any wild bird or animal, except nuisance species, at any time without a permit as required by law."),
  BAITED("It is unlawful to occupy any baited blind or other baited place for the purpose of taking or attempting to take any wild game bird or wild game animal or to put out bait or salt for the purpose of taking or killing any wild game bird or wild game animal, except for the purpose of trapping furbearing animals."),
  LITTER("It is unlawful to destroy, mutilate, or take down “posted” signs or litter. Conviction of littering can result in loss of hunting license."),
  BAG_LIMIT("It is unlawful to exceed the bag limit or possess over the daily limit of any wild bird or animal while in the forests, fields, or waters of this state."),
  LIVE_DECOY("It is unlawful to use live birds or animals to decoy or call game."),
  TRANSPORT("It is unlawful to possess or transport any wild bird or wild animal or the carcass or the parts thereof, unless specifically allowed and only in accordance with regulations."),
  SELL("It is unlawful to sell or purchase any wild bird or wild animal carcass or parts thereof, except as specifically permitted by law."),
  DEER_BODILY_FLUIDS("It is unlawful to to possess or use deer scents or lures that contain natural deer urine or other bodily fluids while taking, attempting to take, attracting, or scouting wildlife in Virginia."),
  RADIO_TRACKING("It is unlawful to use radio tracking equipment, except on dogs or on raptors permitted by a falconry permit, to aid in the chase, harvest or capture of wildlife."),
  DRONES("It is unlawful to use drones (unmanned aerial vehicles) to hunt, take, or kill a wild animal and to attempt to locate, surveil, aid, or assist in hunting a wild animal."),
  ASSIST("It is unlawful to hunt or attempt to kill or trap any species of wild bird or wild animal after having obtained the daily bag or season limit during such day or season. However, any properly licensed person, or a person exempt from having to obtain a license, who has obtained such daily bag or season limit while hunting may assist others who are hunting game by calling game, retrieving game, handling dogs, or conducting drives if the weapon in possession is an unloaded firearm, unloaded arrowgun, a bow without a nocked arrow, or an unloaded crossbow. Any properly licensed person, or person exempt from having to obtain a license, who has obtained such season limit prior to commencement of the hunt may assist others who are hunting game by calling game, retrieving game, handling dogs, or conducting drives, provided said person does not have a firearm, bow, crossbow, or arrowgun in their possession."),
  //Legal Use of Firearms and Archery Tackle section
  UNPLUGGED_SHOTGUNS("Unplugged shotguns are legal for hunting nonmigratory game and crows."),
  TEN_GAUGE("Shotguns (including muzzleloading shotguns) must NOT be larger than 10 gauge and barrels MUST be at least 18 inches. (Rifled barrels are permitted in areas where slugs may be used)"),
  FROM_BOAT("All game birds and animals may be hunted from a boat (with a SHOTGUN and landowner permission), EXCEPT deer."),
  TRAPPERS_OVER_WATER("(Licensed trappers may shoot a .22 caliber rifle or pistol on or over public inland waters to dispatch trapped animals)"),
  MUZZLELOADER("Muzzleloaders used for deer/bear/elk must be loaded from the muzzle and fire only a single shot, single bullet or saboted bullet .35 caliber or larger."),
  MUZZLELOADER_SEASON("Muzzleloading shotguns/rifles, arrowguns, or archery tackle may be used to hunt during the muzzleloading and firearms seasons"),
  ARCHARY_EQUIPMENT("Archery equipment may include: longbows, recurves, compounds, crossbows, sling-bow and pneumatic powered arrowguns/airbows."),
  ARROW_GUN_EXCEPTION("Persons with a disablilty which hinders them from drawing a bow/crossbow may use an arrowgun during archery seasons when in possession of an authorization form provided by DGIF and signed by their physician. physician (www.dgif.virginia.gov/forms/#license-forms)."),
  SMALL_GAME("All methods may be used to hunt nuisance species, crow, and small game."),
  //Other Weapons Usage section
  MIGRATORY_3_SHELL_LIMIT("Unlawful to hunt migratory game birds with a shotgun capable of holding more than three shells in the magazine and chamber, combined, unless allowed by federal regulations and authorized by the Department."),
  PUBLIC_ROAD("Unlawful to discharge a firearm, arrowgun, or archery tackle in or across or within the right-of-way of any public road."),
  LIGHT_ATTACHED_TO_VEHICLE("Unlawful to cast a light attached to a vehicle or from a vehicle beyond a roadway upon places used by deer without written permission of the landowner or at anytime while in the possession of a rifle, shotgun, pistol, arrowgun, archery tackle, or speargun."),
  RECKLESS("Unlawful to handle any firearm in a reckless manner so as to endanger the life, limb, or property of any person."),
  OVER_PUBLIC_WATER("Unlawful to shoot a rifle or pistol at wild birds or animals on or over the public inland waters of the state. However, licensed trappers may shoot a .22 caliber rimfire rifle or pistol on or over public inland waters for the purpose of dispatching trapped animals."),
  LOADED_WEAPON_ON_BOAT("Unlawful to carry a loaded rifle or pistol on a boat or other floating device on public inland waters for hunting wild birds or animals."),
  DEER_FROM_BOAT("Unlawful to kill or attempt to kill any deer while in a boat or other type of watercraft."),
  BOAT_WHILE_MOVING("Unlawful to shoot waterfowl or migratory game birds from a boat being propelled by a motor."),
  FROM_VEHICLE("Unlawful to shoot or attempt to take any wild bird or animal from any vehicle, except as otherwise provided by law."),
  RETRIEVING_DOGS("Unlawful to use vehicles or possess firearms (including concealed weapons) while retrieving dogs on private lands without permission of the landowner."),
  EXPLOSIVE("Unlawful to hunt with explosive head arrows or arrows to which any drug, chemical, or toxic substance has been added."),
  AUTOMATIC("Unlawful to hunt wild birds and wild animals with fully automatic firearms, (i.e., machine guns)."),
  //Valid Concealed Handgun Permit Holders section
  POSSESSION_AND_TRANSPORT_CONCEALED("Nothing in any Department regulation shall prohibit the possession and transport of a concealed handgun when the individual possesses a valid concealed weapon permit as defined in the Code of Virginia"),
  CONCEALED_AUTHORIZATION("The granting of a concealed handgun permit shall not thereby authorize the possession of any handgun or other weapon on property or in places where such possession is otherwise prohibited by law or is prohibited by the owner of private property"),
  CONCEALED_HUNTING("The possession of a concealed handgun permit does not authorize the use of the concealed handgun for hunting"),
  //Unlawful Feeding of Certain Wildlife
  FEEDING("Department regulation makes it illegal to place, distribute, or allow the placement of food, minerals, salt, carrion, trash, or similar substances to feed or attract all species: Illegal to feed any wild animal when the feeding results in property damage, endangers people or wildlife, or creates a public health concern"),
  FOOD_OR_SALT_ON_DEPARTMENT_LAND("It is unlawful to place or direct the placement of, deposit, distribute, or scatter food or salt capable of attracting or being eaten by bear, deer, or turkey year round on National Forest and Department-owned lands."),
  LOCAL_ORDINANCE("Cities and towns have the authority to prohibit the feeding of deer by local ordinance. Contact localities for details."),
  FOOD_PLOT("No part of this regulation shall be construed to restrict bonafide agronomic plantings (including wildlife food plots) or distribution of food to livestock"),
  //All Terrain Vehicle (ATV) Laws section
  ATV_PUBLIC_PROPERTY(" No ATV shall be operated on any public highway, or other public property, except as authorized by proper authorities or to the extent necessary to cross a public highway by the most direct route."),
  ATV_AGE(" No ATV shall be operated by any person under the age of 16, except that children between the ages of 12 and 16 may operate ATVs powered by engines of no less than 70 cubic centimeters nor more than 90 cubic centimeters displacement."),
  ATV_HELMET(" No ATV shall be operated by any person unless he is wearing a protective helmet of a type approved by the Superintendent of State Police for use by motorcycle operators."),
  ATV_PERMISSION(" No ATV shall be operated on another person’s property without the written consent of the owner of the property or as explicitly authorized by law."),
  ATV_PASSENGER(" No ATV shall be operated with a passenger at any time, unless vehicle is designed and equipped to be operated with more than one rider. The above does not apply to members of the household or employees of the owner or lessee of private property on which the ATV is operated.");
  //EAB section, out of scope
  
  
  private String description;
  private static final String source = "https://www.dgif.virginia.gov/hunting/regulations/general/";
  
  GeneralHuntingRegulations(final String description){
    this.description = description;
  }
  
  public static Set<Restriction> getRestrictions() {
    final Set<Restriction> restrictions = new HashSet<>();
    
    for(GeneralHuntingRegulations reg : GeneralHuntingRegulations.values()) {
      restrictions.add(new Restriction(reg.name(), reg.description, source));
    }
    
    return restrictions;
  }
}

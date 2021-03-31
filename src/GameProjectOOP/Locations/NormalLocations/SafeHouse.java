package GameProjectOOP.Locations.NormalLocations;

import GameProjectOOP.Characters.Character;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Character character) {

        super(character, "Safe House");
    }

    public boolean getLocation() {
        character.setHealthy(character.getReHealthy());
        System.out.println("Your healthy has  filled! Health :" + character.getHealthy());
        return true;
    }
}

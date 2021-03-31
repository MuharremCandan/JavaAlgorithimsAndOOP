package GameProjectOOP.Locations.NormalLocations;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Locations.Location;

public abstract class NormalLoc extends Location {

    public NormalLoc(Character character, String name) {
        super(character);
        this.name = name;

    }

    @Override
    public abstract boolean getLocation();
}


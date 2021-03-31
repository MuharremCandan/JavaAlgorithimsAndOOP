package GameProjectOOP.Locations.BattleLocations;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Obstacles.Vampire;

public class Forest extends BattleLoc{
    public Forest(Character character) {
        super(character, "Forest", new Vampire(),"FireWood");
    }
}

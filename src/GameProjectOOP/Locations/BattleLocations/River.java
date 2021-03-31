package GameProjectOOP.Locations.BattleLocations;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Obstacles.Bear;

public class River extends BattleLoc{
    public River(Character character) {
        super(character, "River", new Bear() ,"Water");
    }
}

package GameProjectOOP.Locations.BattleLocations;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Obstacles.Zombie;

public class Cave extends BattleLoc{
    public Cave(Character character) {
        super(character, "Cave", new Zombie(),"Food");
    }


}

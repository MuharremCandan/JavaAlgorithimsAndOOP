package GameProjectOOP.Locations;

import GameProjectOOP.Characters.Character;

import java.util.Scanner;

public abstract class Location {
    protected Character character;
    protected  String name;
    public Scanner scan = new Scanner(System.in);

    public Location(Character character) {
        this.character = character;
    }

    public abstract boolean getLocation();

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

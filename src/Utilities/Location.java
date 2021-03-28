package Utilities;

public abstract class Location {
    protected Character character;
    protected  String name;

    public Location(Character character) {
        this.character = character;
    }

    public abstract boolean getLocation();
}

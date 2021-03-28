package Utilities;

public abstract class NormalLoc extends  Location{

    public NormalLoc(Character character, String name) {
        super(character);
        this.name=name;

    }

    @Override
    public boolean getLocation() {
        return false;
    }
}


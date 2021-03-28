package Utilities;

public abstract class BattleLoc extends Location{
    Obstacle obstacle;

    public BattleLoc(Character character,String name , Obstacle obstacle) {
        super(character);
        this.name=name;
        this.obstacle=obstacle;
    }

    public boolean getLocation(){
        return true;
    }
}

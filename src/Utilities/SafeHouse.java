package Utilities;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Character character) {
        super(character, "Safe House");
    }
    public boolean getLocation(){
        character.setHealthy(character.getReHealthy());
        System.out.println("Your healthy has  filled !");
        return true;
    }
}

package GameProjectOOP.Locations.BattleLocations;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Locations.Location;
import GameProjectOOP.Obstacles.Obstacles;

public abstract class BattleLoc extends Location {
    protected Obstacles obstacle;
    protected String award;

    public BattleLoc(Character character, String name, Obstacles obstacle,String award) {
        super(character);
        this.name = name;
        this.obstacle = obstacle;
        this.award=award;
    }

    public boolean getLocation() {
        int obsNum = obstacle.obstaclNum();
        System.out.println("You are at " + getName());
        System.out.println("Be Careful !!" + obsNum + " " + obstacle.getName() + " live here in this " + getName() + " !!");
        System.out.println("---------------------------------------");
        System.out.println("<W>ar or <E>scape");
        String option = scan.nextLine();
        if (option.toUpperCase().equals("W")) {
            if (combat(obsNum)) {
                System.out.println("---------------------------------------");
                System.out.println("You defeat all enemies at " + getName());
                if (this.award.equals("Food") && character.getInv().isFood()==false){
                    System.out.println("You had some "+award);
                    character.getInv().setFood(true);
                }
                else if (this.award.equals("Water") && character.getInv().isWater()==false){
                    System.out.println("You had some "+award);
                    character.getInv().setWater(true);
                }
                else if (this.award.equals("FireWood") && character.getInv().isFirewood()==false){
                    System.out.println("You had some "+award);
                    character.getInv().setFirewood(true);
                }
                return true;

            }
            if(character.getHealthy()<=0){
                System.out.println("You are died !");
                return false;
            }

        }
        return true;

    }

    public boolean combat(int obsNum) {
        int defaultObshealth = obstacle.getHealth();
        for (int i = 0; i < obsNum; i++) {
            character.getCharacterStats();
            obstacle.getObstacleStates();
            while (character.getHealthy() > 0 && obstacle.getHealth() > 0) {
                System.out.println("---------------------------------------");
                System.out.println("<H>it or <E>scape");
                String option = scan.nextLine();
                System.out.println("---------------------------------------");
                if (option.toUpperCase().equals("H")) {
                    System.out.println("You hit the enemy!");
                    obstacle.setHealth(obstacle.getHealth() - character.getTotalDamage());
                    System.out.println("Character Health : " + character.getHealthy());
                    System.out.println(obstacle.getName() + " Health : " + obstacle.getHealth());

                    if (obstacle.getHealth() > 0) {
                        System.out.println();
                        System.out.println("The " + obstacle.getName() + " hit you!");
                        character.setHealthy(character.getHealthy() - (obstacle.getDamage() - character.getInv().getArmor()));
                        System.out.println("Character Health : " + character.getHealthy());
                        System.out.println(obstacle.getName() + " Health : " + obstacle.getHealth());
                    }


                } else {
                    return  false;
                }

            }
            if (obstacle.getHealth() <= 0 && character.getHealthy() > 0) {
                System.out.println("---------------------------------------");
                System.out.println("You defeated the enemy! ");
                character.setMoney(character.getMoney() + obstacle.getAward());
                System.out.println("Total Money: " + character.getMoney());
                obstacle.setHealth(defaultObshealth);
            } else {
                return false;
            }


        }


        return true;
    }

    public void showHealthAfterHit(){

        System.out.println("Character Health : " + character.getHealthy());
        System.out.println(obstacle.getName() + " Health : " + obstacle.getHealth());
    }


}




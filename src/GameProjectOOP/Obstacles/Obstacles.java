package GameProjectOOP.Obstacles;

import java.util.Random;

public class Obstacles {
    private String name;
    private int damage, health, award, maxNum;


    public Obstacles(String name, int damage, int health, int award, int maxNum) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.maxNum = maxNum;
    }

    public int obstaclNum() {
        Random r = new Random();
        return r.nextInt(this.maxNum) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public void getObstacleStates(){
        System.out.println("-----------------------------------");
        System.out.println("Obstacle Stats: ");
        System.out.println("Name : "+getName());
        System.out.println("Health : "+getHealth());
        System.out.println("Damage : "+getDamage());
        System.out.println("Award :"+getAward());
    }
}

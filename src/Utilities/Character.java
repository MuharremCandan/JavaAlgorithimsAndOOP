package Utilities;

import java.util.Scanner;

public class Character {
    private int id;
    private String name, characterName;
    private int damage;
    private int healthy;

    public int getReHealthy() {
        return reHealthy;
    }

    public void setReHealthy(int reHealthy) {
        this.reHealthy = reHealthy;
    }

    private int reHealthy;
    private int money;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);

    public Character(String name) {

        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public void selectCharacter() {


        switch (chaMenu()) {
            case 1:
                initPlayer("Yaren", 21, 5, 15);
                break;
            case 2:
                initPlayer("Muharrem", 7, 18, 20);
                break;
            case 3:
                initPlayer("Piupiu", 24, 8, 5);

                break;
            default:
                initPlayer("Yaren", 21, 5, 15);
                break;

        }
        System.out.println("Your Character:\nName:" + getCharacterName() + "\nHealthy:" + getHealthy() + "\nDamage:" + getDamage() + "\nMoney:" + getMoney());
        System.out.println();
    }

    public void initPlayer(String name, int damage, int healthy, int money) {
        setCharacterName(name);
        setHealthy(healthy);
        setDamage(damage);
        setMoney(money);
        setReHealthy(healthy);
    }

    public int chaMenu() {
        System.out.println("Please choose a character:");
        System.out.println("1- Genus: Yaren \t Damage: 5 \t Healthy:21 \t Money:15");
        System.out.println("2- Genus: Muharrem \t Damage: 7 \t Healthy:18 \t Money:20");
        System.out.println("3- Genus: Piupiu \t Damage: 8 \t Healthy:24 \t Money:5");

        System.out.print("Your option:");
        int chaId = scan.nextInt();
        System.out.println();
        while (chaId < 1 || chaId > 3) {
            System.out.print("Invalid character id !\nPlease enter an valid character id:");
            chaId = scan.nextInt();

        }
        return chaId;
    }
}


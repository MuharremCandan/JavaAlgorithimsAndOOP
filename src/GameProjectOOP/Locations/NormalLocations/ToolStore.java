package GameProjectOOP.Locations.NormalLocations;

import GameProjectOOP.Characters.Character;

public class ToolStore extends NormalLoc {
    public ToolStore(Character character) {
        super(character, "Tool Store");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Your balance:" + character.getMoney()+"\n");

        System.out.println("1. Weapons\n2. Armors \n3. To Quit ");
        System.out.println("---------------------------------------");
        System.out.println("Your Option:");
        int option = scan.nextInt();
        int itemId;
        switch (option) {
            case 1:
                itemId = weaponMenu();
                buyWeapon(itemId);
                break;
            case 2:
                itemId = armorMenu();
                buyArmor(itemId);
                break;
            case 3:
                System.out.println("Tool Store is shutting down !");
                break;
            default:
                break;

        }
        return false;
    }

    public int armorMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1.Light Armor\t <Price:15 -  Avoid:1> ");
        System.out.println("2.Medium Armor\t <Price:25 -  Avoid:3> ");
        System.out.println("3.Heavy Armor\t <Price:40 -  Avoid:5> ");
        System.out.println("4. To quit");
        System.out.println("---------------------------------------");
        System.out.println("Your option: ");
        int armorId = scan.nextInt();

        return armorId;

    }

    public void buyArmor(int armorId) {
        int avoid = 0, price = 0;
        String armorName = null;
        switch (armorId) {
            case 1:
                avoid = 2;
                price = 15;
                armorName = "Light Armor";

                break;
            case 2:
                avoid = 3;
                price = 25;
                armorName = "Medium Armor";

                break;
            case 3:
                avoid = 5;
                price = 40;
                armorName = "Heavy Armor";
                break;
            default:
                System.out.println("Invalid number.");
                break;

        }
        if (price > 0) {
            if (character.getMoney() >= price) {
                character.getInv().setArmor(avoid);
                character.getInv().setArmorName(armorName);
                character.setMoney(character.getMoney() - price);

                System.out.println(armorName + " has added to you inventory.\n Avoid Damage:" + character.getInv().getArmor());
                System.out.println("Available balance : " + character.getMoney());
            } else {
                System.out.println("Insufficient balance.");
            }
            System.out.println();
        }

    }

    public int weaponMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1.Gun\t <Price:25 -  Damage:2> ");
        System.out.println("2.Sword\t <Price:35 -  Damage:3> ");
        System.out.println("3.Rifle\t <Price:45 -  Damage:7> ");
        System.out.println("4. To quit");
        System.out.println("---------------------------------------");
        System.out.println("Your option: ");
        int weaponId = scan.nextInt();

        return weaponId;
    }


    public void buyWeapon(int itemId) {
        int damage = 0, price = 0;
        String weaponName = null;
        switch (itemId) {
            case 1:
                damage = 2;
                price = 25;
                weaponName = "Gun";

                break;
            case 2:
                damage = 3;
                price = 35;
                weaponName = "Sword";

                break;
            case 3:
                damage = 7;
                price = 45;
                weaponName = "Rifle";
                break;
            default:
                System.out.println("Invalid number.");
                break;

        }
        if (price > 0) {
            if (character.getMoney() >= price) {
                character.getInv().setDamage(damage);
                character.getInv().setWeaponName(name);
                character.setMoney(character.getMoney() - price);

                System.out.println(weaponName + " has added to you inventory.\nOld Damage:" + character.getDamage() + "\nNew Damage: " +
                        character.getTotalDamage());
                System.out.println("Available balance : " + character.getMoney());
            } else {
                System.out.println("Insufficient balance.");
            }
            System.out.println();
        }


    }
}

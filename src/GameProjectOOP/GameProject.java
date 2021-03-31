package GameProjectOOP;

import GameProjectOOP.Characters.Character;
import GameProjectOOP.Locations.BattleLocations.Cave;
import GameProjectOOP.Locations.BattleLocations.Forest;
import GameProjectOOP.Locations.BattleLocations.River;
import GameProjectOOP.Locations.Location;
import GameProjectOOP.Locations.NormalLocations.SafeHouse;
import GameProjectOOP.Locations.NormalLocations.ToolStore;

import java.util.Scanner;

public class GameProject {
    private Character character;
    private Location location;
    Scanner scan = new Scanner(System.in);

    public void login() {

        System.out.println("Welcome to my fucking world in my mind !");
        //System.out.print("Please enter your name: ");
        //String playerName=scan.nextLine();
        character = new Character("Müko");
        character.selectCharacter();
        start();


    }

    public void start() {

        while (true) {
            System.out.println("---------------------------------------");
            String places = "1-Safe House --->Your home. Your health will get fill here. And there is your princess is waiting for you.\n" +
                    "2-Cave  --->There might be a few zombies(1-3)\n" +
                    "3-Forest ---->There might be a few vampire.(1-3)\n" +
                    "4-River --->There might be a few bear\n" +
                    "5-Shop ---> Armors and weapons ,you can buy.";
            System.out.println(places);
            System.out.println("---------------------------------------");
            System.out.println("Choose a place to go:");
            int placeNum = scan.nextInt();
            System.out.println("---------------------------------------");
            while (placeNum < 1 || placeNum > 5) {
                System.out.println("Invalid place number !\nPlease choose a valid num:");
                placeNum = scan.nextInt();
            }
            switch (placeNum) {
                case 1:
                    location = new SafeHouse(character);

                    break;
                case 2:
                    location = new Cave(character);


                    break;
                case 3:
                    location = new Forest(character);

                    break;
                case 4:
                    location = new River(character);

                    break;
                case 5:
                    location = new ToolStore(character);
                    break;
                default:
                    location = new SafeHouse(character);
                    break;

            }
            if (location.getClass().getName().equals("SafeHouse")) {
                if (character.getInv().isFirewood() && character.getInv().isWater() && character.getInv().isFood()) {
                    System.out.println("Congratulations ! You won the game !");
                    break;
                }
            }
            if (!location.getLocation()) {
                System.out.println("Game has ended !");
                break;
            }


        }
    }

}

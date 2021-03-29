package GameProjectOOP;

import java.util.Scanner;

public class Game {
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


            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("Please choose a place to go !\n");
            String places = "1-Safe House --->Your home. Your health will get fill here. And there is your princess is waiting for you.\n" +
                    "2-Cave  --->There might be a few zombies(1-3)\n" +
                    "3-Forest ---->There might be a few vampire.(1-3)\n" +
                    "4-River --->There might be a few bear\n" +
                    "5-Shop ---> Armors and weapons ,you can buy.";
            System.out.println(places);
            System.out.print("Choose a place to go:");
            int placeNum = scan.nextInt();
            while (placeNum < 1 || placeNum > 5) {
                System.out.println("Invalid place number !\nPlease choose a valid num:");
                placeNum = scan.nextInt();
            }
            switch (placeNum) {
                case 1:
                    location = new SafeHouse(character);
                    location.getLocation();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }


        }
    }

}

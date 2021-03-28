import Utilities.Game;

import java.util.Scanner;

public class main {
    public static  void main(String[] args) throws InterruptedException {
      /* Game game = new Game();
        game.login();

       */

        for (int i=1; i<6;i++){
            System.out.print("Testing: "+i);
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println("  Successful");
        }
        System.out.println("Mission completed :)");

    }
}

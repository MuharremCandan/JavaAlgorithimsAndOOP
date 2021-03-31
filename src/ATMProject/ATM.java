package ATMProject;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATMManger atm = new ATMManger("Muharrem", "123456", 1500.50);
        if (atm.login()) {
            while (true) {
                System.out.println("Welcome");
                System.out.println("***********");
                System.out.println("\n1-Deposit Money\n2-Withdraw Money\n3-Quit");
                int option = scan.nextInt();
                switch (option) {

                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        int deposit = scan.nextInt();
                        atm.depositeMoneyFromBalance(deposit);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        int withdraw = scan.nextInt();
                        atm.withdrawMoneyToBalance(withdraw);
                        break;
                    case 3:
                        System.out.println("System shutting down !");
                        return;
                    default:
                        System.out.println("Invalid character !");
                        break;


                }

            }
        } else {
            System.out.println("Something went wrong !");
        }

    }


}


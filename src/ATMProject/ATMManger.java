package ATMProject;

import java.util.Scanner;

public class ATMManger {
    private String cusName;
    private String cusPassword;
    private Double cusMoney;

    public ATMManger(String cusName, String cusPassword, Double cusMoney) {
        this.cusName = cusName;
        this.cusPassword = cusPassword;
        this.cusMoney = cusMoney;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public Double getCusMoney() {
        return cusMoney;
    }

    public void setCusMoney(Double cusMoney) {
        this.cusMoney = cusMoney;
    }

    public void withdrawMoneyToBalance(int amount) {
        if (getCusMoney() - amount < 0) {
            System.out.println("Your amount is more than your balance. !");
        } else {
            setCusMoney(getCusMoney() - amount);
            System.out.println("New balance: " + getCusMoney());
        }
    }

    public void depositeMoneyFromBalance(int amount) {
        setCusMoney(getCusMoney() + amount);
        System.out.println("new Balance: " + getCusMoney());
    }
    public boolean login() {
        Scanner scan = new Scanner(System.in);
        int right = 3;

        while (right > 0) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();
            if (name.equals(getCusName()) && password.equals(getCusPassword())){
                System.out.println("Welcome to CNDN_ATM.");
                return true;
            }else{
                right--;
                System.out.println("You have last "+right+" right to sign in.!");
            }
        }
        return  false;
    }
}

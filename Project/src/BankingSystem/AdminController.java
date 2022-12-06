package BankingSystem;

import java.util.Scanner;

public class AdminController {
    public static void main(String[] args) {

        while (true) {
            System.out.println("*****WELCOME TO SBI BANK**********");
            System.out.println("Press 1 for create Account");
            System.out.println("Press 2 for view Account");
            System.out.println("Press 3 for withdraw money");
            System.out.println("Press 4 for deposit money");
            System.out.println("Press 5 for update Account");
            System.out.println("Press 6 for exit");

            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    ServiceI serviceI = new ServiceImpl();
                    serviceI.createAccount();
                    break;
                case 2:
                    ServiceI serviceI1 = new ServiceImpl();
                    serviceI1.viewAccount();
                    break;
                case 3:
                    ServiceI serviceI2 = new ServiceImpl();
                    serviceI2.withdrawMoney();
                    break;
                case 4:
                    ServiceI serviceI3 = new ServiceImpl();
                    serviceI3.depositMoney();
                    break;
                case 5:
                    ServiceI serviceI4 = new ServiceImpl();
                    serviceI4.updateAccount();
                    break;
                case 6:
                    System.out.println("Thanks for Using our services");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if (ch == 6)
                break;
        }

    }
}

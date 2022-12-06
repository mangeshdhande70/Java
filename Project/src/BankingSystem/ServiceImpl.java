package BankingSystem;

import java.util.Scanner;

public class ServiceImpl implements ServiceI {

    Account account  = new Account();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void createAccount() {

        account.setAccNo(12345);
        System.out.println("Enter Name");
        account.setAccName(scanner.nextLine());
        System.out.println("Account Created Successfully");
        viewAccount();
    }

    @Override
    public void viewAccount() {

        System.out.println("Account No - "+account.getAccNo());
        System.out.println("Customer Name - "+account.accName);
        System.out.println("Logic to view Account");

    }

    @Override
    public void withdrawMoney() {
        System.out.println("Logic to withdraw money");

    }

    @Override
    public void depositMoney() {
        System.out.println("Logic to deposit money");

    }

    @Override
    public void updateAccount() {
        System.out.println("Logic to update account");

    }

}

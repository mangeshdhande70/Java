package Inheritance.Interface.Ineuron;


import java.util.Scanner;

interface IBanks{  // Interface name always start from I

    void deposit();   // public void abstract deposit()
    void withdraw();  // public void abstract withdraw()
    int balance();

}
// if class does not able to implement all the methods in interfaces then u want to declare that class as abstract
abstract class BanksImpl implements IBanks{ // implementatin class name is Interface name without first letter (I)
                                             // and at the last include impl (Banksimpl)


    static int balance;
    Scanner scanner = new Scanner(System.in);

   // void deposit(){} by default this method if default (ac access specifier) but we implement this method from
    // from interface and in interface by default this method is public so, we have to declare this method as Public

    @Override
    public void deposit()    // It is compulsory to write Public if method is implements from interfaces
    {
        long amount;
        System.out.println("Enter amount You want to Deposit");
        amount = scanner.nextLong();
        balance+=amount;
        check();

    }

    void check()
    {
        System.out.println("\nDo you want to check your remaining balance?");
        System.out.println("\n1. Yes");
        System.out.println("2. No");
        byte input = scanner.nextByte();
        switch (input){
            case 1: balance();
                break;
            case 2: System.out.println("Thank you for Using our Bank!");
                break;
            default: System.out.println("Thank you for using our Bank!");
        }
    }


}

class SubBankImpl extends BanksImpl  // extending naming convention (Sub-Extending_className)
{
    long withdrawAmount;
    @Override
    public void withdraw()
    {
        System.out.println("Enter amount to withdraw");
        withdrawAmount = scanner.nextLong();
        if (balance > withdrawAmount) {
            System.out.println("Please collect your cash! ");
            balance -= withdrawAmount;
        }
        else System.out.println("Insufficient Account Balance");
        check();
    }

    @Override
    public int balance()
    {
        System.out.println("Account Balance is "+balance);
        return balance;
    }

}


public class RealTimeUsing {

    public static void main(String[] args) {

        IBanks iBanks = new SubBankImpl(); // loose coupling
        BanksImpl banks = new SubBankImpl(); // Not good approach
        iBanks.deposit();
        iBanks.withdraw();
       // iBanks.balance();

    }



}

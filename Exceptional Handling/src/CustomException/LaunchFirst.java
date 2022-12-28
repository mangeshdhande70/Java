package CustomException;


import java.util.Scanner;

class InvalidCustomerInput extends Exception{

    public InvalidCustomerInput(String s)
    {
        super(s);
    }
}
class Customer{

    int userId = 1234;
    int password = 0000;
    int uId;
    int pass;

    Scanner scanner = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter User Id");
        uId = scanner.nextInt();
        System.out.println("Enter User pass");
        pass = scanner.nextInt();
    }
    boolean verify() throws InvalidCustomerInput {
        if (userId==uId && password==pass) {
            System.out.println("Before leaving, count your cash! Thank You! ");
            return true;
        }
        else {
            InvalidCustomerInput o = new InvalidCustomerInput("User Id or Pass are Wrong! Try again...");
            System.out.println(o.getMessage());
            throw o;
        }
    }
}

class Bank{

    void initiate() {

        Customer c = new Customer();
//        int count = 0;
       try {
           c.input();
           c.verify();
       }catch (Exception e){
           try {
               c.input();
               c.verify();
           }catch (Exception e1){
               try {
                   c.input();
                   c.verify();
               }catch (Exception e2){
                   try {
                       System.out.println("This is your last chance, if you give wrong input then card will blocked");
                       c.input();
                       c.verify();
                   }catch (Exception e3){
                       System.out.println("Your card Blocked due to exceeding pass limits");
                   }
               }
           }
       }
    }
}

public class LaunchFirst {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}

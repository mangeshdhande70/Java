package StaticKeyword.src;

import java.util.Scanner;

class Farmer{

    private static float roi;
    private float pa;
    private float td;

    private float si;
    private float totalAmountToPaid ;

    static {
        roi = 2.5F;
    }

    void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kindly enter amount u need : ");
        pa= scanner.nextFloat();
        System.out.println("kindly enter time duration : ");
        td= scanner.nextFloat();
        simpleInterest();



    }

    void simpleInterest()
    {
        si = pa*(1+ roi*td);
        totalAmount();
    }

    void totalAmount()
    {
        totalAmountToPaid = pa + si;
        display();

    }

    void display()
    {
        System.out.println("Simple interest is "+si);
        System.out.println("After adding Interest u have to pay total amount :- "+totalAmountToPaid);
    }

}

public class Bank {

    public static void main(String[] args) {

        Farmer farmer = new Farmer();
        farmer.input();

    }
}

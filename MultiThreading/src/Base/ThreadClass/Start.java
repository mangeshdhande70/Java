package Base.ThreadClass;


/**

 Not Good Approach bcz of we're not able to Inherit the another class bcz already we extend Thread.

 */

import java.util.Scanner;

class Child extends Thread{
    @Override
    public void run()
    {

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Child");

        }

        run(6);

    }

    public void run(int a)
    {
        System.out.println("a = "+a);
    }

}

public class Start {
    public static void main(String[] args) {


        Child child = new Child();
        child.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main");


        }

    }
}

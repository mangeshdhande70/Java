package Basic;
import java.util.Scanner;

/**

 The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.

 *  We can throw either checked or unchecked exception.
 *  The throw keyword is mainly used to throw custom exceptions.
    But this exception i.e, Instance must be of type Throwable or a subclass of Throwable.
    For example Exception is a subclass of Throwable


  */



class Exceptions{

    Scanner scanner = new Scanner(System.in);
    void method()
    {
        System.out.println("Connection Establish");
        try {
            System.out.println("Enter Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter Denominator");
            int num2 = scanner.nextInt();

            int res = num1 / num2;

            System.out.println("result = " + res);
        }
        catch (Exception e){
            System.out.println("please don't enter Denominator zero "+e);
            throw(e);
        }
        System.out.println("Connection Disconnected");

    }
}


public class Throw {
}

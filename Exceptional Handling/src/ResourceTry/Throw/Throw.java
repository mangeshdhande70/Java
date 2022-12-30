package ResourceTry.Throw;
import java.util.Scanner;

/**

 Define: - The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
          ( handle the Exception and throw it back the exception object to the caller )

 *  We can throw either checked or unchecked exception.

 *  The throw keyword is mainly used to throw custom exceptions.
    But this exception i.e, Instance must be of type Throwable or a subclass of Throwable.
    For example Exception is a subclass of Throwable

 * throw will throw the exception Object to the caller catch block if caller catch block
   matched to the Exception then Execution will terminate Normally otherwise abnormally
   termination will be done.


  */

class Exceptions {

    public static void main(String[] args) {

        Throw obj = new Throw();
        try {
            obj.method();
        }catch (ArithmeticException a)
        {
            System.out.println("non zero allowed in Denominator "+a);
        }

        ArithmeticException a = new ArithmeticException();
//        throw (a);
    }

}

class Throw{
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

            /*
               * throw() will throw the exception Object to the caller catch block if caller catch block
                 matched to the Exception then Execution will terminate Normally otherwise abnormally
                 termination will be done.

             */
            throw(e);
        }
        System.out.println("Connection Disconnected");

    }
}



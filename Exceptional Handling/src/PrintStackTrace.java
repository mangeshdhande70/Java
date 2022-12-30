
/**


 * The printStackTrace() method of Java Throwable class is used to print the Throwable along with other details
   like classname and line number where the exception occurred.


 */


import java.util.Scanner;

public class PrintStackTrace {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the Nem");
        int num = scanner.nextInt();
        System.out.println("Enter the Den");
        int den = scanner.nextInt();

        try{
            int res = num/den;
        }catch (ArithmeticException a)
        {
            a.printStackTrace();
        }


    }
}

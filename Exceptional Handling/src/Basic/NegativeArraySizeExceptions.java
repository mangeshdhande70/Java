package Basic;

import java.util.Scanner;

public class NegativeArraySizeExceptions extends Throwable {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Connection Established");

        try {
            System.out.println("Enter the size of array");

            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array element");
            int a = scanner.nextInt();

            System.out.println("Enter position where element you want to keep");
            int position = scanner.nextInt();

            arr[position] = a;

            System.out.println("Element " + a + " inserted at Position " + arr[position]);
        }
        catch (ArrayIndexOutOfBoundsException ai)
        {
            System.out.println("please give correct size for keeping element "+ai);
        }
        catch (Exception e)
        {
            System.out.println("you can't give array size as negative "+e);
        }
        finally {
            System.out.println("Connecting---> finally block always executed");
        }

        System.out.println("Connection Disconnected");






    }


}

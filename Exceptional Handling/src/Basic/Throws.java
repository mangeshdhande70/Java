package Basic;

public class Throws {

// Throws just ignoring (Ducking the Exception) , not handling.


    /**


     throws is a keyword in Java which is used in the signature of method to indicate that this
     method might throw one of the listed type exceptions. The caller to these methods has to
     handle the exception using a try-catch block.



      * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hello ");
        Thread.sleep(10000);
         System.out.println("I'm Mangesh");

    }


}

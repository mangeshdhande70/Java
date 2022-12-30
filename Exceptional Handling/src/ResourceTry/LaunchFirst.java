
package ResourceTry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



/**

  try with resources
 ==========================================================

 * In this approach, the resources which are opened as a part of try block will be closed automatically once
   the control reaches to the end of try block normally or abnormally,so it is not required to close explicitly
   so the complexity of the program would be reduced.

 * It is not required to write finally block explicitly,so length of the code would be reduced and
   readability is improved.


  Syntax
 --------------------------------------

              |-===== here you only pass the object of that classes which implements AutoCloseable interface Directly or Indirectly.
             |
  try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))
   {

      //use br and perform the necessary operation

      //once the control reaches the end of try automatically br will be closed

   }
   catch(IOException ie){
     //handling code
  }



  Rules of using try with resource
 ========================================================
 1. we can declare any no of resources, but all these resources should be separated with ;

     eg#1.
            try(R1;R2;R3;){
               //use the resources
            }


 2. All resources are said to be AutoCloseable resources iff the class implements an interface called
    "java.lang.AutoCloseable" either directly or indirectly.

    eg:: java.io package classes, java.sql.package classes

            public interface java.lang.AutoCloseable {
                public abstract void close() throws java.lang.Exception;
            }

        Note: which ever class has implemented this interface those classes objects are referred as "resources".

 3. All resource reference by default are treated as implicitly final and hence we can't perform
    reassignment with in try block.

        try(BufferedReader br=new BufferedReader(new FileWriter("abc.txt")){
                    br=new BufferedReader(new FileWriter("abc.txt"));
        }

        output::CE: can't reassign a value

 4. until 1.6 version try should compulsorily be followed by either catch or finally, but from 1.7 version
    we can take only take try with resources without cath or finally.

        try(R){
            //valid
        }

 5. Advantage of try with resources concept is finally block will become dummy because we are not required to
    close resources explicitly.


 6. try with resource nesting is also possible.

        try(R1){
            try(R2){
                try(R3){
                }
            }
        }



 AutoCloseable Interface
 ===========================================================================

 * AutoCloseable is an interface which is present in java.lang package and, it has close method.

 public interface java.lang.AutoCloseable {
    public abstract void close() throws java.lang.Exception;
 }


 AutoCloseable(Interface) ---> Closeable(Interface) ---> Reader(Class) ----> BufferedReader(Class)

 */

public class LaunchFirst {


    public static void main(String[] args) throws IOException {



        System.out.println("Connection Established");
        Scanner scanner = new Scanner(System.in);
        String str = null;


        /*

          * It is a try with Resources here you only pass the object of that classes which implements
            AutoCloseable interface Directly or Indirectly.

          * In resources the resource object are always final.

         */
        try(BufferedReader obj = new BufferedReader(new FileReader("Sample"))) {

            System.out.println("Hello World");
//            obj = new BufferedReader(new FileReader("akash.text"));
        } catch (ArithmeticException e){

            e.printStackTrace();

        }catch (Exception e) {

            e.printStackTrace();

        }
    }


}

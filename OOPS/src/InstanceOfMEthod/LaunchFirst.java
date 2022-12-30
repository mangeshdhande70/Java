package InstanceOfMEthod;

import java.util.ArrayList;

/**

  * we can use the instanceOf operator to check the given an object is particular type or not

         R instanceOf X

         where,     R ====> reference
                    X ====> class/InterfaceName



 * => To use instanceof operator compulsory there should be some relation between argument types
      (either child to parent Or parent to child Or same type) Otherwise we will get compile time
      error saying inconvertible types.

         eg:
                  1. String s= new String("sachin");
                     System.out.println(s instanceof Thread);//CE

                  2. Thread t=new Thread( );
                   System.out.println(t instanceof String);//CE



 * => Whenever we are checking the parent object is child type or not by using instanceof operator
      that we get false.


            1. Object o=new Object( );
               System.out.println(o instanceof String ); //false


            2.Object o=new String("ashok");
              System.out.println(o instanceof String); //true


 * => For any class or interface X null instanceof X is always returns false

              System.out.println(null instanceof X); //false

 */


class Student{


}

class Cricketer{

}

class Customer{

}


public class LaunchFirst {


    public static void main(String[] args) {



        Integer a = new Integer(4);

        System.out.println(a instanceof Object);
        System.out.println(a instanceof Integer);
        System.out.println();


        System.out.println("\n\n****** Thread Reference **********");

        Thread thread = new Thread();
        System.out.println(thread instanceof Runnable);
        System.out.println(thread instanceof Thread);
        System.out.println(thread instanceof Object);

//        System.out.println(thread instanceof String); CE.



        System.out.println("\n\n****** Object Reference **********");
        Object obj = new Thread();

        System.out.println(obj instanceof Thread );
        System.out.println(obj instanceof Runnable);
        System.out.println(obj instanceof String);

        System.out.println("NUll");
        System.out.println(null instanceof Object);

        /*

           System.out.println(null instanceof X); False

           where X -> interface or class always returns false

        */






        ArrayList al = new ArrayList();

        al.add(new Student());
        al.add(new Student());
        al.add(new Student());

        Object o = new Object();
        if (o instanceof Student)
        {
           Student student = (Student) o;

        } else if (o instanceof Customer) {

            Customer cu = (Customer) o;

        }
//        else {
//            Cricketer cricketer = (Cricketer) o;
//        }

    }

}

package InstanceOfMEthod;


import java.util.Calendar;

/**

 isInstance()
 ==========

 Difference between instanceof and isInstance( ) :


 instanceof
 =========

*  instanceof an operator which can be used to check whether the given object is particular type or not
   We know at the type at beginning it is available.

        eg:
            String s = new String("sachin");
            System.out.println(s instanceof Object );//true

            //If we know the type at the beginning only.
                isInstance( )


* isInstance( ) is a method , present in class Class , we can use isInstance() method to checked whether
  the given object is particular type or not We don't know at the type at beginning it is available
  Dynamically at Runtime.

        class Test {
                public static void main(String[] args) {
                        Test t = new Test( ) ;
                        System.out.println(Class.forName(args[0]).isInstance(t));////arg[0] --- We don't know
                                                                                                the type at beginning
              }
 }
                     java Test Test //true
                     java Test String //false
                     java Test Object //tru


 */


class Student1{


}




public class isInstanceOfMethod {


    public static void main(String[] args) throws ClassNotFoundException {


        Student1 student1 = new Student1();


//        System.out.println(Class.forName(isInstanceOfMethod).isInstance(student1) );

        isInstanceOfMethod obj = new isInstanceOfMethod();


        Student1 student11 = new Student1();

//        System.out.println(Class.forName(String.valueOf(isInstanceOfMethod.class)).isInstance(student1));

        System.out.println(Class.forName(args[0]).isInstance(student1));


        String str = "hello";

        String str1 ;

//        System.out.println(Class.forName(str1).isInstance());


    }


}

/**



 * It is mandatory to write default keyword if interface method has a body.

 * default method inside interface can be inherited and also be overridden(Optional).

 * if there is requirement where whichever class is going to provide the implementation for your methods,
   you want some implementation to be common for all the implementing classes then u can use this default method
   inside interface.


 * Inside Interface from java 8 , we can have static method however the static method will not be
   inherited in implementing classes but class to class Inheritance static method will Inherit.

 * from java 9 private method inside Interface is allowed , private method of Interface will not be Inherited
   in implementing classes and, also it can not be call from another class , only for internal purpose
   it is allowed and calling from inside same class method it will call.


 */



package Inheritance.Interface.Interface_Method_With_Body;

// it is mandatory to write default keyword if interface method has a body.

interface Default{

    default void test()  // It is not abstract method ---> it is public in nature
    {
        System.out.println("Inside default test Method");
    }

    default void test2()
    {
        System.out.println("Inside default test2 Method");
        display2();
    }

    void method();


    // Java 8
    static void display()
    {
        System.out.println("Inside static Interface method");
    }


    // Java 9
    private void display2()
    {
        System.out.println("Interface private Method");
    }

    private static void dis3()
    {
        System.out.println("hello inside dis3()");
    }

}


class Student implements Default{

    @Override
    public void method() {
        System.out.println("Hello World i am inside method & implementation given by Student Class ");
    }

//    @Override
//    static void display(){  // it is Special method
//
//    }
}


public class DefaultInter implements Default {

    public static void main(String[] args) {


        Student student = new Student();
        student.test();
        student.method();


        Default.display();   // calling of Interface static Method

        DefaultInter defaultInter =  new DefaultInter();

        defaultInter.test();

        Default defaults = new DefaultInter(); // loos coupeling
        defaults.test();


    }

    @Override
    public void method() {
        System.out.println("Inside method & implementation given by DefaultInter");
    }


    @Override
    public void test() {
        System.out.println("Inside test & implementation given by DefaultInter");
    }


}

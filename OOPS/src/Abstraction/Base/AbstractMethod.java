/**

 * Abstract method can't have its Body or Implementation.
 * Abstract method can't be final bcz if it's final then other class can't be Override this and
   no one can give its Body or Implementation.
 * if a single method in a class is abstract then that class has to be abstract.


 */




package Abstraction.Base;

abstract class Student{

    public void method1()
    {
        System.out.println("Hello");
    }

    abstract void method2();

}

public class AbstractMethod extends Student{


    public static void main(String[] args) {

        AbstractMethod abstractMethod = new AbstractMethod();
        abstractMethod.method2();
        abstractMethod.method1();

    }

    @Override
    void method2() {
        System.out.println("Inside method2 & inside BastractMethod Class");
    }
}

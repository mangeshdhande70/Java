/**

    * static Methods will be inherited in subClass but can't be overridden and using className
      you have to call that static method.

    *

 */




package StaticMethods;



class Parent{

    static int a=60;

    static void method1()
    {
        System.out.println("Inside a Parent method1");
    }

}

class Child extends Parent
{

    void dis()
    {
        Parent.a =70;
    }

//    void method1()
    {

    }


}

public class Methods  {

    public static void main(String[] args) {


        Child objectChild = new Child();

        Child.method1();  // Inherited

        System.out.println("a inside Child -- "+ Child.a);

        System.out.println("a inside Parent -- " +Parent.a);


    }
}

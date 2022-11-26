package Inheritance;


class Parent{

     static void display()
    {
        System.out.println("Inside Parent class");
    }

}

class child extends Parent{

    static void display()  // -- it is treated as specialized method so u cannot call using Parent reference
    {
        System.out.println("Inside Child class");
    }

}

public class staticMethodInheritance {


    public static void main(String[] args) {

        Parent obj = new child();



    }
}

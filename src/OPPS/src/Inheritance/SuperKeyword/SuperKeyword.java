/**
 to call Parent class Variable and Method


 */



package OPPS.src.Inheritance.SuperKeyword;


class Parent{

    int i =10;

    public void display()
    {
        System.out.println("Inside a Parent, i = "+i);
    }

}

class Child extends Parent{

    int i =20;

    public void display()
    {
        System.out.println("Inside Child, i = "+i);
        System.out.println("Using super keyword, i = "+super.i);
    }

}


public class SuperKeyword {

    public static void main(String[] args) {

        Parent p = new Child();
        p.display();


    }


}

package Polymorphism;


class Parent{

    public void display()
    {
        System.out.println("In Parent class");
    }

}

class Child extends Parent{

    public void display()
    {
        System.out.println("In Child class");
    }

}

public class Upcasting {

    public static void main(String[] args) {

        Parent parent = new Child(); // Upcasting
        parent.display();


    }

}

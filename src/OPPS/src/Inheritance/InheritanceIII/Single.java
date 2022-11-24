package OPPS.src.Inheritance.InheritanceIII;
class Parent{

    int a=67;
    Parent(){
        System.out.println("\nInside parent class Constructor");
    }


    void display()
    {
        System.out.println("\nInside a Parent display method");
    }

}


class Child extends Parent{

    //Copy of all the methods and properties but not a constructor but always super class constructor
    // will call because of super() inside a child constructor
    Child()
    {
        System.out.println("\nInside a child class Constructor");
    }

    void insideChild()
    {
        System.out.println("Inside child method");
    }



}

public class Single {


    public static void main(String[] args) {

        Child child1 = new Child();
        child1.a = 78;
        System.out.println(child1.a);
        child1.display();
        child1.insideChild(); // bcz it is reference of child class (its own), and also it can call all the
                              // methods that is available in its parent class


        Parent child2 = new Child(); // new object is created in Heap,and a = 67
        System.out.println(child2.a);
        child2.display();
        //  child2.insideChild();  Not possible bcz the object is referenced by Parent and parent cant
        // Inherit its child class method and properties.


      //  Child child3 = new Parent(); child class cant

        Parent parent = new Parent();
        parent.display();
    //    parent.insideChild(); Not accessible





    }


}

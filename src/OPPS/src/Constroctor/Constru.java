package OPPS.src.Constroctor;

public class Constru {

    public static void main(String[] args) {


        new Alien().func(); /*anonymous objects "The object without any name or ref variable is known as anonymous objects" */

        System.out.println(new Alien().name);  // whenever u create new object constructor will be called first

        System.out.println();
        System.out.println("************************************************");

        Alien obj1;
        obj1 = new Alien();


        obj1.func();
        System.out.println(obj1.age);

        System.out.println();
        System.out.println("************************************************");

        Alien obj2 = new Alien(); // here create a memory space in heap , let's say 100

        obj2 = new Alien();   // here create new memory in heap , let's  sya 103 and the first object created
                                // will clean by GC (garbage collector)

        obj2.func();
        System.out.println(obj2.name);


    }
}

class Alien{

    int age = 20;
    String name = "Vikas";
    float salary = 22300.89f;

    public void func(){

        System.out.println("Inside a Function");
    }

    public Alien()
    {
        System.out.println("Inside a Constructor");
    }


}

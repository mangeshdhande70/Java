package Inheritance.InheritanceIII;

class Launch1{

    static {
        System.out.println("\nInside static block of Launch1 **** ");
    }
    Launch1()
    {
        System.out.println("\nInside Launch1 Constructor");
    }
    static {
        System.out.println("\nInside static block of Launch1 after Constructor");
    }

}

class Launch2 extends Launch1{

    static {
        System.out.println("\nInside static block of Launch2");
    }
    Launch2() {
        System.out.println("\nInside Launch2 Constructor");
    }

}

class Launch3 extends Launch2{


    static {
        System.out.println("\nInside static block of Launch3");
    }
    Launch3()
    {
        System.out.println("\nInside Launch3 Constructor");

    }


}
class Launch4 extends Launch3{

    static {
        System.out.println("\nInside static block of Launch4");
    }
    Launch4()
    {
        System.out.println("\nInside Launch4 Constructor");
    }
//    Launch3()  Constructor can't be inherited but super class constructor will executed
//    {
//
//    }

}

public class Multilevel {

    public static void main(String[] args) {
        Launch4 launch4 = new Launch4();

    }



}

package OPPS.src.Inheritance.Interface.QP;

interface Greeting
{
    default void greet(){  // when u have to give implementation then use default
       System.out.println("In Greet Interface");
    }
}

class GreetingDef implements Greeting{
    public void greet(){
        System.out.println("In GreetingDef class");
    }
//    public int greet()
//    {
//        System.out.println("Hello");
//    }

}

public class Main {

    public static void main(String[] args) {

        Greeting obj = new GreetingDef();

        obj.greet();


    }

}

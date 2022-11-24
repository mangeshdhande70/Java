package OPPS.src.Static;

public class Folks {

    String name;  // instance variable
    int age;   // instance variable
    static String tech = "java";  // Class variable


    public Folks()
    {
        System.out.println("In Constructor");
    }

    static {                       // static block executed once
        tech = " java";
        System.out.println("Inside Static Block");
    }

    static void Stat_function()
    {
        // fun() ; for fun we need a object , without object we can't call non-static function
        System.out.println("inside Static Function");
    }

    public  void fun(){
        Stat_function();
        System.out.println("Inside fun");
    }


}


package OPPS.src.Polymorphism.Constructor_Overloading;

public class constr {

    static {
        System.out.println("Inside Static Block");
    }

    public constr(){
        System.out.println("Inside default  Construction");

    }
    public constr(String type){
        System.out.println("Inside parameterized constructor : " + type);
    }
}

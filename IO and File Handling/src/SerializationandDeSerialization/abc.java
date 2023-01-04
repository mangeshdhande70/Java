package SerializationandDeSerialization;



class A{

    static {
        System.out.println("static block Executed");
    }
    A()
    {
        System.out.println("Inside Constructor");
    }

    {
        System.out.println("Inside java Block");
    }

    A(int a){
        System.out.println("inside para constructor.....a = "+a);
    }
}

public class abc {
    public static void main(String[] args) {


        A a = new A(45);

        A a1 = new A();



    }
}

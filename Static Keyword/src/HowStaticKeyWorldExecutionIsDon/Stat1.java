package HowStaticKeyWorldExecutionIsDon;

class Launch{

    static int x; //x and y both are static variable & it is initialized first during class loading
    static int y;

    int a,b; // Instance variable...the value of the instance variable is vary object by object
    static {         // static block also executed during class loading
        System.out.println("Before initialization of value x and y ");
        System.out.println("x = "+x+"\ny = "+y);
        System.out.println("\nInside a Static Block");
        x=10;
        y=20;
        System.out.println("x = "+x+"\ny = "+y);
//        a=30; U can't access instance variable inside a static block
//        b=50;
    }
    public Launch() // when object is created it will execute and if there is any java block it included and
                   // execute that block first and then actual body of constructor will execute.
    {
        System.out.println("\nInside a Constructor");

        x=30;
        y=40;
        a=60;
        b=70;
        System.out.println("x = "+x+"\ny = "+y+"\na = "+a+"\nb = "+b);

    }
    static void display(int l,int m) // this is static method , independet on object and whenever programmer
                                     // call it will executed using call name if it is not in same class
                                     // if it is same class it will call using methodName
    {
        System.out.println("\nInside a Static Method");
         x = 50;
         y = 60;
//         a=35;  U can't access instance variable inside a static Method
//         b=37;
        l=10;
        m=20;
        System.out.println("x = "+x+"\ny = "+y+"\nl = "+l+"\nm = "+m);

    }

    {  // this is a non-static java block , whenever constructor call it is include in that constructor
        // and executed first then actual body of constructor will executed
        System.out.println("\nInside a Java Block");
        x=10;
        y=20;
        a=10;
        b=45;
        System.out.println("x = "+x+"\ny = "+y+"\na = "+a+"\nb = "+b);

    }

    void disp1() // this is a non-static method, it should depend on programmer(whenever programmer call
                // it is executed but for calling that we required ref variable and object creation
    {

        System.out.println("\nInside a Non-Static Method");
        x=45;
        y=50;
        a=90;
        b=80;
        System.out.println("x = "+x+"\ny = "+y+"\na = "+a+"\nb = "+b);

    }


}

public class Stat1 {

    public static void main(String[] args) {

//        static int a;  we can't declare static method inside any method(static or non-static)


        Launch.display(4,5);
        Launch launch = new Launch();
        launch.disp1();


//
//        boolean [] b = new boolean[1];
//        System.out.println(b[0]);





    }


}

package StaticBlock;

public class Stact2 {
    static int a=0;
    int y ;

    static {
        a=1;
        System.out.println("In static Block");
        System.out.println("value of a is initialized to = "+a);
    }

    {
        a++;
        y=45;
        System.out.println("\nIn java Block");
        System.out.println("a = "+a);
        System.out.println("y = "+y);
    }
    Stact2()
    {
        this(34);
        a++;
        System.out.println("\nOutput in first Constructor");
        System.out.println("a = "+a);
        {
            System.out.println("Java block inside a constructor invoked");
        }

    }
    Stact2(int a)
    {
        super();
        a++;
        this.a = a;
        System.out.println("\nOutput in second Constructor");
        System.out.println("a = "+a);
    }

    Stact2(int a,int b)
    {
        this(89);
        System.out.println("\nInside a Constructor 3");
        System.out.println("a = "+a+b);
        System.out.println("a = "+(a+b));
    }

    static void display(int x)
    {

        a++;
        a=x;
//        y=56; Instance variable can't be access by static method
        System.out.println("\nOutput in static Method");
        System.out.println("a = "+a);
//        display(); can't access non-static method

    }

    public void display()
    {

        y++;
        a++;
        System.out.println("\nOutput in Non-Static method");
        System.out.println("a = "+a);
        System.out.println("y = "+y);
        System.out.println("\nAfter calling Static display method from display non-static method ");
        display(86);

        {
            System.out.println("Hello Java Block");
        }

    }

    public native int square(int i);
    public static void main(String[] args) {

        Stact2 stact2 = new Stact2();
        Stact2.display(56);
        stact2.display();

        Stact2 stact21 = new Stact2(45);
        stact21.display();

        Stact2 stact22 = new Stact2(5,5);




//        System.loadLibrary("StaticBlock.Stact2");
//        System.out.println(new StaticBlock.Stact2().square(3) );


    }


}

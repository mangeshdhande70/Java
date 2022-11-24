package OPPS.src.Inheritance.Interface.Ineuron;

interface IJava{

    int a = 10;  // by default variables in interface are public static final & we have to initialize them.

    public static final int b = 20;

    void display();

}

class JavaImpl implements IJava{

    int a=89;
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(IJava.a);
    }


}

public class Variable {


    public static void main(String[] args) {

        IJava iJava = new JavaImpl();
        iJava.display();
    }
}

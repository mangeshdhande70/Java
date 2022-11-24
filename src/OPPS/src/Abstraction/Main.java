package OPPS.src.Abstraction;

abstract class Parentt{
    static {
        System.out.println("Static block simple");
    }
    public abstract void fun();  //we can not declare abstract body here
    public void print(){   // non-Abstract method have to declare its body compulsory
        System.out.println("in non-abstract Method");
    }


//    public abstract final void fun1(); we cannot create abstract method as final ..it gives err illeagle comb err

    public static void staticmethod(){
        System.out.println("in static method");
    }

    public final void finalmethod()
    {
        System.out.println("in final method");
    }

    public void show(){
        System.out.println("In Abstract class and show method");
    }
}

class childd extends Parentt{

    @Override
    public void fun() {
        System.out.println("In Abstract Method and Abstraction.child class");
    }
    public void print()
    {
        System.out.println("In class Abstraction.child , Non-abstract method");
    }
}

public abstract class Main {


    public static void main(String[] args) {

//        Abstraction.Parent p = new Abstraction.Parent();  we cannot create object of abstract class

        childd c = new childd();
        Parentt p = new childd();

        System.out.println("Using Child ref");
        c.fun();
        c.print();
        c.show();
        c.finalmethod();

        System.out.println();
        System.out.println("using parents ref");
        p.fun();
        p.print();
        p.finalmethod();
        p.show();

        Parentt.staticmethod();
    }



}


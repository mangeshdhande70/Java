package OPPS.src.Abstraction;

abstract class Parent{

   final void fun() // inherited but can't be overridden
    {
        System.out.println("In abstract class");
    }

    abstract void fun1();
    abstract int loan();


}

class child extends Parent{


//     void fun() // inherited but can't be overridden
//    {
//        System.out.println("In abstract class");
//    }

    @Override
    void fun1() {
        System.out.println("In child fun1");

    }

    @Override
    int loan() {
        System.out.println("In child loan");
        return 0;
    }
}

class child2 extends Parent{

    @Override
    void fun1() {
        System.out.println("In child2 fun1");
    }

    @Override
    int loan() {
        System.out.println("In child2 in loan");
        return 0;
    }
}
class P{

    void entry(Parent parent)
    {
        parent.fun();
        parent.fun1();
        parent.loan();
    }

}



public abstract class Abstract {

    public static void main(String[] args) {


        System.out.println("Hello world");


        P p = new P();
        p.entry(new child());

        Parent parent = new child2();
        p.entry(parent);


//
//        Parent parent;
//        parent=new child();
//        parent.fun();
//        parent.loan();
//        parent.fun1();
//
//
//        parent = new child2();
//        parent.fun();
//        parent.loan();
//        parent.fun1();


    }


}

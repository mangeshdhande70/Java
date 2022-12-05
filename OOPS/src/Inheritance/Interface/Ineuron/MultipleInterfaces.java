package Inheritance.Interface.Ineuron;


interface IDemo1{

     void display();

}
interface IDemo2 extends IDemo1{
    void demo();
}

interface IDem03 extends IDemo1,IDemo2{

    void m1();

}

class commonImpl implements IDemo1,IDemo2{

    public void display()
    {
        System.out.println("In display method");
    }

    public void demo()
    {
        System.out.println("Inside Demo");
    }
}

class Demo3Impl implements IDem03{

    @Override
    public void display() {
        System.out.println("Inside a Demo3");
    }

    @Override
    public void demo() {
       System.out.println("Inside a Demo3 in demo");
    }

    @Override
    public void m1() {
        System.out.println("Inside m1 method");
    }
}


public class MultipleInterfaces {

    public static void main(String[] args) {
        IDemo2 iDemo2 = new commonImpl();
        iDemo2.demo();
        iDemo2.display(); // is extends otherwise it is not accessible
        IDemo1 iDemo1 = new commonImpl();
        iDemo1.display();



    }
}

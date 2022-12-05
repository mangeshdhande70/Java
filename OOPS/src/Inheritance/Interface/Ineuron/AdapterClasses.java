package Inheritance.Interface.Ineuron;


interface IInterfaces {

    void m1();
    void m2();
    void m3();
    void m4();

}


class AdapterClass implements IInterfaces{

    @Override
    public void m1(){}

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
    ;

}

class SubClass extends AdapterClass{

    @Override
    public void m3() {
        System.out.println("Inside Subclass method m3");
    }
}

public class AdapterClasses {

    public static void main(String[] args) {

        IInterfaces obj = new AdapterClass();
        obj.m1();
        obj.m3();

        IInterfaces obj1 = new SubClass();
        obj1.m1();
        obj1.m3();


    }
}

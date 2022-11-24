package OPPS.src.Inheritance.Interface.Ineuron;
/**

 que: Can a java class implements 2 interfaces simultaneously?
 ans -  Yes possible , but in both the interface method name or method signature should be different,
        not only return type.

 */



interface IDemo{

    void display();
}

interface IDemo22{

   // int display();

}

class SampleImpl implements IDemo,IDemo22{

    @Override
    public void display() {

    }

//    public int display() {
//
//        return 0;             this is not possible both the interfaces method signature should be different,
//                               not only return Type
//    }
//    public void display()
//    {
//
//    }
}


public class TwoInterfaces {


    public static void main(String[] args) {

    }

}

package Inheritance.Interface.Interface_Inside_interface;


interface IOuterInterface{

    interface IInnerInterface{

        void methodIInnerInterface();

    }

    void methodIOuterInterface();

}

public class InsideInterface implements IOuterInterface, IOuterInterface.IInnerInterface {
    @Override
    public void methodIOuterInterface() {
        System.out.println("Outer Interface -----> Inside methodIOuterInterface");
    }

    @Override
    public void methodIInnerInterface() {
        System.out.println("Inner Interface ------> Inside methodIInnerInterface");
    }


    public static void main(String[] args) {

        InsideInterface insideInterface = new InsideInterface();
        insideInterface.methodIInnerInterface();
        insideInterface.methodIOuterInterface();


    }
}

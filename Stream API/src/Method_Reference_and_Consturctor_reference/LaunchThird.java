package Method_Reference_and_Consturctor_reference;



interface Interface{

    public void interFaceMethod(int i);
}

public class LaunchThird {


    // logic is written by other developers and this method is binded with interFaceMethod
    public void logicCoded(int i)
    {
        System.out.println("From method Reference :: i ==> "+i);
    }


    public static void main(String[] args) {


        // using Lambda expression

        Interface interfaceRef = i -> System.out.println("lambda Expression");
        interfaceRef.interFaceMethod(100);


        System.out.println();

        // Binding of logicCoded LaunchThird class method with Interface method ( need argument data should be match )
        // it only works for Functional Interface.
        Interface referenceOfInterface = new LaunchThird()::logicCoded;

        referenceOfInterface.interFaceMethod(50);


    }
}
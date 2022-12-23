/**

 Consider a lambda expression which is as follows:

        str -> System.out.println(str)
        By method reference, it will change to this:


         System.out::println
         In method reference, the :: operator divides the method name from the class or object name.



 */





package MethodReference;

interface Interface{

     void interFaceMethod(int i);
}

public class ALaunchThird {


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
        Interface referenceOfInterface = new ALaunchThird()::logicCoded;

        referenceOfInterface.interFaceMethod(50);


    }
}
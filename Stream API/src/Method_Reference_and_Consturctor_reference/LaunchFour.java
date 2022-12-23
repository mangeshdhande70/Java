package Method_Reference_and_Consturctor_reference;


@FunctionalInterface
interface MyInterface{

    int method(int a, String b);


}

public class LaunchFour {

    // for binding need same parameter and same return type
    int methodInsideClass(int key , String value)
    {
        System.out.println(" Key :: "+key +"  , Value :: "+value);

        return key;
    }


    public static void main(String[] args) {


        MyInterface myInterface = new LaunchFour()::methodInsideClass; // method is non-static so we need to use new

        int key = myInterface.method(10,"Nirli");

        System.out.println("Key ===> "+key);


    }



}

/**

    Final Class doesn't Participate in Inheritance

 */

package Class;

public class final_Class {

    public static void main(String[] args) {

    }
}
class A{
    public void fun(){
        System.out.println("Inside class A");
    }
}
final class B extends A{
    public void fun2(){
        System.out.println("Inside class B");
    }
}

//class C extends B{    Not possible
//
//}


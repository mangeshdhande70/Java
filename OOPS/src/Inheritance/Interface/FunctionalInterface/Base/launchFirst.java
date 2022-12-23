/**

   * Functional Interface contains only one abstract method.

   * also it can contain static and default methods.

 */

package Inheritance.Interface.FunctionalInterface.Base;


@FunctionalInterface
interface Custom<T> {

    void getId();

    public static String staticMethod() {  // this method is only calling from default method
        return "Hey! I'm static String Method inside Functional Interface";
    }

    default void defaultMethod()
    {
        System.out.println("hey! I'm Default method");
        staticMethod();
    }


}



public class launchFirst {


    public static void main(String[] args) {


        Custom custom = () ->
        {
            System.out.println("Calling by lambda");
        };

        custom.getId();
        custom.defaultMethod();



    }


}

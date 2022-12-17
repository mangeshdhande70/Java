/**

 * Object of abstract class can't be Instantiate.
 * abstract class can't be final.
 * abstract class always have to extended by another class .
 * abstract class has abstract method as well as simple methods.


 */




package Abstraction.Base;


abstract class Employee{

   private String name;
   private Integer idNo;

   public void method()
   {
      System.out.println("Hey! Hiiiiiiii");
   }

   abstract public void method2();

}
public class AbstractClass extends Employee {


   public static void main(String[] args) {

//      Employee employee = new Employee(); Not Possible


      AbstractClass abstractClass = new AbstractClass();
      abstractClass.method();
      abstractClass.method2();

   }


   @Override
   public void method2() {
      System.out.println("Inside method2 & inside AbstractClass");
   }
}

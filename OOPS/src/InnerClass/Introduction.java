/**
 
 How to create Object of Inner class
 __________________________________________________________________

 1) For Non-Static -

         OuterClass objectOfOuter = new OuterClass();

         OuterClass.InnerClass objectOFInnerClass = objectOfOuter.new InnerClass();




 2) For Static -

            OuterClass.InnerClass objectOFInnerClass = new OuterClass.InnerClass();





 */



package InnerClass;

class OuterClass1 {

    int a = 9;
    private int var = 80;

    private void input()
    {
        System.out.println("Inside a Outer class private input method");
    }

    class InnerClassNonStatic{

        static int c = 234;

        public void display()
        {
            int b = 90;
            System.out.println("Inside a Non Static class B method");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("var = "+var); // also can access private methods and variable
            System.out.println();
            input();
            fun(); // Inner class can access Outer class methods & variables directly

        }

    }

    static class InnerClassStatic{  // inner class can be a static


       static class V{

            public void funV()
            {
                System.out.println("Inside V Inner class ");
            }
        }

        class N{

           public void funN()
           {
               System.out.println("Inside N non-static class");
           }

        }

        public void cMethod()
        {
            System.out.println("Inside a static class Method");
        }
        public static void cMethod2()
        {
            System.out.println("Inside a Static class and Static method");
        }

    }

    public void fun()
    {
//        cMethod(); also not access static class methods and variable
//        cMethod2()
        System.out.println("In Outer class A public method fun");
        System.out.println("a = "+a);
//        System.out.println("b = "+b);
//        System.out.println("c = "+c);
        System.out.println();
//        display()  Outer class cannot access methods & variables of Inner class directly

        input();

    }

}



public class Introduction {

    public static void main(String[] args) {

        OuterClass1 objectOfOuter = new OuterClass1();
        objectOfOuter.fun();
//        obj.input();  private method can't access directly

//        InnerClassNonStatic obj1 = new InnerClassNonStatic(); Not work for Inner Class

          OuterClass1.InnerClassNonStatic objectOfInner = objectOfOuter.new InnerClassNonStatic(); // Non-static
        objectOfInner.display();   // only this class Method can access via Object , not access its Outer class

          OuterClass1.InnerClassNonStatic objB = objectOfOuter.new InnerClassNonStatic();

          OuterClass1.InnerClassStatic obj2 = new OuterClass1.InnerClassStatic(); // for static

          OuterClass1.InnerClassStatic.V objV = new OuterClass1.InnerClassStatic.V();

          objV.funV();

    }



}

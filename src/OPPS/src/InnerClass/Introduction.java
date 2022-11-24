package OPPS.src.InnerClass;


class A{

    int a = 9;
    private int var = 80;

    private void input()
    {
        System.out.println("Inside a Outer class private input method");
    }

    class B{

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

    static class C{  // inner class can be a static


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

        A obj = new A();
          obj.fun();
//        obj.input();  private method can't access directly

//        B obj1 = new B(); Not work for Inner Class

          A.B obj1;
          obj1 = obj.new B(); // Non-static
          obj1.display();   // only this class Method can access via Object , not access its Outer class

          A.B objB = obj.new B();

          A.C obj2 = new A.C(); // for static

          A.C.V objV = new A.C.V();

          objV.funV();

    }



}

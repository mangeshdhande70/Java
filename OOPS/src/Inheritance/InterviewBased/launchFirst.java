package Inheritance.InterviewBased;


class Parent{


    private static void method1(){

        System.out.println("Inside The Parent Class method1()");

    }

    public void method2(){

        System.out.println("Inside The Parent Class method2()");

    }

    public final void method3(){
        System.out.println("Inside The Parent Class method3()");
    }

}

class Child extends Parent{


    public void method4()
    {
        System.out.println("Inside Child Class");
    }


}





public class launchFirst {

    public static void main(String[] args) {



        Child child = new Child();


//        child.method1();  not possible bcz this method is private
         child.method2();
         child.method3();
         child.method4();


         Parent p = new Child();
         p.method2();
         p.method3();

         Parent parent = new Parent();



    }


}

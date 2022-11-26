package InnerClass;

interface Demo{

    void demo();
}

public class OuterClass{
    class InnerClass{

//        public static void main(String[] args) {  --- u can create
//
//            System.out.println("Inside Inner class Main Method");
//            OuterClass outerClass = new OuterClass();
//            outerClass.display();
//
//
//        }

        public static void methodSecond()
        {
            System.out.println("Inside Second MethodSecond");
            OuterClass outerClass = new OuterClass();
            outerClass.innerClassCallingMethod();
        }

        public void methodOne()
        {
            System.out.println("Inside Inner Class MethodOne");
            InnerClass.methodSecond();
        }

    }

    public static void main(String[] args) {

        System.out.println("Inside Outer class main Method");
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }

    public void display()
    {
        System.out.println("Inside outer class Display method");

        InnerClass innerClass = new InnerClass();
        innerClass.methodOne();
    }

    public void innerClassCallingMethod()
    {
        System.out.println("Called from Inner Class, Inside Outer Class Method");
    }

}



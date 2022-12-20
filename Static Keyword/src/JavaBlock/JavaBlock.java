package JavaBlock;

public class JavaBlock {


    static int a=8;
    int b = 9;
    static int count;

    {
        count++;
    }

    JavaBlock()
    {
        System.out.println("inside constructor without parameter");
    }

    JavaBlock(int a)
    {
        System.out.println("Inside para constructor");
        System.out.println("a = "+a);
    }

    public static void display()
    {
        System.out.println("Inside static method");
    }

    public void display(String name)
    {
        System.out.println("Inside non-static method");
        System.out.println("My name is "+name);

    }

    public static void main(String[] args) {


        JavaBlock javaBlock = new JavaBlock();
        JavaBlock javaBlock1 = new JavaBlock(23);
        display();
        javaBlock1.display("Lakhan");
        System.out.println("How many Object is created : = "+count);

    }



}

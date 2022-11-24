package WrapperCls;

class A{


    public void display(Integer i)
    {
        System.out.println("Inside Integer "+i);
    }


    public void display(int i)
    {
        System.out.println("Inside int "+i);
    }


}

public class IntegerAnd_int {

    public static void display(Integer i)
    {
        System.out.println("Inside Integer "+i);
    }


    public static void display(int i)
    {
        System.out.println("Inside int "+i);
    }


    public static void main(String[] args) {

        A a = new A();
        a.display(8);

        display(10);
    }
}

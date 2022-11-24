package WrapperClasses.src.Widing_Vs_AutoBoxing;


class In{

    public void display(Integer s)
    {
        System.out.println("Inside Integer arg,  s = "+s);
    }

    public void display(int s)
    {
        System.out.println("Inside int arg,  s = "+s);
    }

}



public class IntegerVsInt {

    public static void main(String... args) {

        In in = new In();
        System.out.println("int");
        int a = 90;
        in.display(a);

        System.out.println("\n\nInteger");
        Integer b = 40;
        in.display(b);



    }
}

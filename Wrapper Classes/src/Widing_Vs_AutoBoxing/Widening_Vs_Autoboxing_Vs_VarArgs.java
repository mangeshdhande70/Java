/**

 Priority if there is a primitive type
 -----------------------------------------
 1st - primitive type
 2nd - Wrapper Class
 3rd - Var Args

 *
 */



package Widing_Vs_AutoBoxing;

class Mix {

    public void methodOne(int i)
    {
        System.out.println("Inside primitive int i = "+i);

    }
    public void methodOne(Integer i)
    {
        System.out.println("Inside Integer ,   i = "+i);

    }public void methodOne(int... i)
    {
        System.out.println("Inside var args ,  int i = "+i);

        for (int arr:i) {
            System.out.println(" "+arr);

        }

    }


    public void secondMethod(Float f)
    {
        System.out.println("inside Float, f = "+f);
    }
    public void secondMethod(float... f)
    {
        System.out.println("inside var Args , f = "+f);
    }

    public void thirdMethod(double d)
    {
        System.out.println("inside double d = "+d);
    }

}

public class Widening_Vs_Autoboxing_Vs_VarArgs {

    public static void main(String[] args) {

        Mix mix = new Mix();


        System.out.println("Primitive");
        int a=90;
        mix.methodOne(a);


        System.out.println("\n\nWrapper");
        Integer b = 20;
        mix.methodOne(b);

        Integer b1 = Integer.valueOf(a);
        mix.methodOne(b1);

        System.out.println("\n\nVar Args");
        mix.methodOne();
        mix.methodOne(20,34,50);


        System.out.println("\n\nFor Float");
        mix.secondMethod(23.5f);



        System.out.println("\n\n");
        Double doubl = 34.6;
        mix.thirdMethod(doubl);


    }


}

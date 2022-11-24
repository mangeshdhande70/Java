package Var_Args;


class Var{

    public void methodOne(int ...x)  //  compile replace it with int[] x
    {
        System.out.println(x);

        for (int a:x) {
            System.out.print(" "+a);
        }
        System.out.println();
    }

    public void secondMethod(String a , float...   f) // String a,float[] f --
                                                     // only 2nd argument can be var Args , not 1st
    {
        System.out.println(a);
        System.out.println(f);

        for (float f1 : f) {
            System.out.print(" "+f1);
        }
        System.out.println();

    }


    public void sum(int ...x)
    {
        System.out.println();
        System.out.println(x);

        int sum = 0;
        for (int a:x) {
            sum+=a;
        }

        System.out.println("sum = "+sum);
    }
}

public class BasicVarArgs {


    public static void main(String[] args) {

        Var var = new Var();
        var.methodOne();
        var.methodOne(1,3,5,6,7,8,9);
        var.methodOne(new int[]{10,20,30,40});


        Var var1 = new Var();
        var1.secondMethod("Hello",123,43,54);
        var1.secondMethod("Hello",333,123,235,226,127,128,139);
//        var1.secondMethod("hii" , (new int[]{0,23,234,55}));


        Var var3 = new Var();
        var3.sum();
        var3.sum(1,3,5,6,7,8,9);
        var3.sum(new int[]{10,20,30,40});



    }



}

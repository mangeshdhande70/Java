package WrapperClasses.src.Widing_Vs_AutoBoxing;

public class Test {

    public void method(Long a)
    {
        System.out.println("Inside Long a = "+a);
    }


    public void methodSecond(Number a)
    {
        System.out.println("Inside Number a = "+a);
    }

    public void methodSecond(Double d)
    {
        System.out.println("Inside Double, d = "+d);
    }

    public void methodSecond(Object d)
    {
        System.out.println("Inside Object, d = "+d);

    }



    public static void main(String[] args) {

        Test t =new Test();
        int x =10;

//        t.method(x); there is a Long Wrapper class so CE, if there Integer then it will Run


        // Widening  === > long,float,double
        // AutoBoxing ===> Integer
        // Widening ===> Number , Object



        t.methodSecond(34.5f);

    }



}

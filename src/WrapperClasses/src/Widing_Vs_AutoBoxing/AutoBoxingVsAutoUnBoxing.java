package WrapperClasses.src.Widing_Vs_AutoBoxing;

class Demo{

    public void m1(long a)
    {
        System.out.println("widening ,,,, in long  a = "+a);
    }

    public void m1(float a)
    {
        System.out.println("Inside float args,  a= "+a);
    }

    public void m1(Integer a)
    {
        System.out.println("Inside Integer , a = "+a);
    }

}



public class AutoBoxingVsAutoUnBoxing {


    public static void main(String[] args) {

        Demo demo = new Demo();
        int a = 90;
        demo.m1(a); // primitive ====> do Typecasting(Implicitly)===>Found====>long(binding happen by Compiler)


    }


}

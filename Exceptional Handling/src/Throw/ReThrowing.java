package Throw;


import RunTimeExcepttion.Arr;

class Demo{

    static void method(){
        try{
            throw new ArithmeticException();
        }catch (ArithmeticException e)
        {
            System.out.println("Exception inside method(_)");
            throw e;//Rethrowing the Exception
        }
    }

}


public class ReThrowing {
    public static void main(String[] args) {

        try{
            Demo.method();
        }catch (Exception e)
        {
            System.out.println("Inside Caller main Method");
        }
    }
}

package OPPS.src.Inheritance.Interface.LambdaExpression;


interface Bank{
    void accountbalance(int n);
}

class SBI implements Bank{
    @Override
    public void accountbalance(int n){
        System.out.println("Account Balance is "+ n);

    }

}

/*
   here SBI class is implement Bans methods only for optimization we can create inner class for these process
 */

public class lamba_basics {

    public static void main(String[] args) {

        // simple method

        System.out.println("Using Simple interface implementation class");
        Bank obj1 = new SBI();
        obj1.accountbalance(45667);


        System.out.println();
        Bank obj2 = new Bank()    // this is same as class implements interface
        {
            @Override
            public void accountbalance(int n) {
                System.out.println("Account balance is " + n);
            }
        };

        System.out.println("Using Inner class");
        obj2.accountbalance(5234);

        /*
           the above declaration is like inner class we can also optimize that using lambda expression
         */

        System.out.println();
        System.out.println("Using Lambda expression");

        Bank obj3 = (n) -> System.out.println("Account balance is "+n);  // this is same as above

        obj3.accountbalance(2345);

    }
}

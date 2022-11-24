package OPPS.src.Polymorphism;


class Loan{

    public void simpleInterest()
    {
        System.out.println("In Loan Class simple Interest");
    }


}
class SBI extends Loan{

    public void sbiLoan()
    {
        System.out.println("In SBI class sbi Loan");
    }

}


public class Downcating {

    public static void main(String[] args) {


        Loan loan = new SBI();
        ((SBI) loan).sbiLoan(); // down Casting ( if u want to call specialized method via parent reference
                                // u have to casting the upper (Parent) to down (child)

    }

}

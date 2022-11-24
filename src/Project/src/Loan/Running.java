package Project.src.Loan;

import java.util.Scanner;

class Loan{

    private float principleAmount;
    private float timeDuration;
    private float simpleInterest;
    private static float rateOfInterest;
    private float totalAmount;

    Loan(float rateOfInterest)
    {
        this.rateOfInterest = rateOfInterest;
    }

    Scanner scan = new Scanner(System.in);

    public void input()
    {
       System.out.println("Enter how much Amount did you want?");
       principleAmount = scan.nextFloat();
       System.out.println("Enter for how much year do you want Loan");
       timeDuration = scan.nextFloat();
       simpleInterest();
       totalAmount();
       display();
    }

    void simpleInterest()
    {
        System.out.println(rateOfInterest);
       simpleInterest = (principleAmount*timeDuration*rateOfInterest)/100;
    }
    void totalAmount()
    {
        totalAmount = principleAmount + simpleInterest;
    }

    void display()
    {
        System.out.println("Total Interest for "+timeDuration+" year is "+simpleInterest);
        System.out.println("Total Amount you have to pay "+totalAmount);
    }

}

class FarmerLoan extends Loan{
    FarmerLoan(float rateOfInterest) {
        super(rateOfInterest);
    }
}

class EducationLoan extends Loan{
    public EducationLoan(float rateOfInterest) {
        super(rateOfInterest);
    }
}
class HomeLoan extends Loan{
    public HomeLoan(float rateOfInterest) {
        super(rateOfInterest);
    }
}

class PersonalLoan extends Loan{
    public PersonalLoan(float rateOfInterest) {
        super(rateOfInterest);
    }
}

public class Running {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Loan loan;

     System.out.println("select which type of Loan do you want? ");
        System.out.println("_________________________________________");
        System.out.println("1. Farmer Loan");
        System.out.println("2. Educational Loan");
        System.out.println("3. Home Loan");
        System.out.println("4. Personal Loan");
        int select_type = scanner.nextInt();
        switch (select_type)
        {
            case 1: loan = new FarmerLoan(3.0f);
                    loan.input();
                    break;
            case 2: loan = new EducationLoan(2.5f);
                    loan.input();
                    break;

            case 3: loan = new HomeLoan(5.5f);
                    loan.input();
                    break;
            case 4: loan = new PersonalLoan(6.2f);
                    loan.input();
                    break;

            default:System.out.println("You selected wrong Option! Please select correct option");


        }
    }


}


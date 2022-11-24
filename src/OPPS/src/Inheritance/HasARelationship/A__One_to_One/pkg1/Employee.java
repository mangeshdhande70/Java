package OPPS.src.Inheritance.HasARelationship.A__One_to_One.pkg1;

// Target Class
public class Employee {

    private String employeeName;
    private Integer employeeId;
    private String employeeUnit;

    Account account;


    public Employee(String employeeName, Integer employeeId, String employeeUnit, Account account) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeUnit = employeeUnit;
        this.account = account;
    }

    public void getEmployeeDetails()
    {


        System.out.println("______ Employee Details ______ ");
        System.out.println("Employee Id     :: "+employeeId+"\nEmployee Name   :: "+employeeName+
                "\nEmployee Unit   :: "+employeeUnit+"\n");

        System.out.println("_____ Bank Details _____");
        System.out.println("Account No       :: "+account.getAccountNo()+"\nAccount Type     :: "+account.getAccountType()
                           +"\nAccount Holder name   :: "+account.getAccountHolderName());

    }



}

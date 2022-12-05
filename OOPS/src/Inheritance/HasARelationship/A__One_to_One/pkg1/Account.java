package Inheritance.HasARelationship.A__One_to_One.pkg1;

// Dependant class
public class Account {

    private Integer accountNo;
    private String accountHolderName;
    private String accountType;

    public Account(Integer accountNo, String accountHolderName, String accountType) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }
}

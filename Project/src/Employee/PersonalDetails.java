package Employee;

public class PersonalDetails {

    private String mobNo;
    private Long bankAccountNo;

    public PersonalDetails(String mobNo, Long bankAccountNo) {
        this.mobNo = mobNo;
        this.bankAccountNo = bankAccountNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public Long getBankAccountNo() {
        return bankAccountNo;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "mobNo='" + mobNo + '\'' +
                ", bankAccountNo=" + bankAccountNo +
                '}';
    }
}

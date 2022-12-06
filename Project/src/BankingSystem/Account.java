package BankingSystem;

public class Account {
    int accNo;

    String accName;

    String accAddr;

    String accPan;

    double accamt;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccAddr() {
        return accAddr;
    }

    public void setAccAddr(String accAddr) {
        this.accAddr = accAddr;
    }

    public String getAccPan() {
        return accPan;
    }

    public void setAccPan(String accPan) {
        this.accPan = accPan;
    }

    public Double getAccamt() {
        return accamt;
    }

    public void setAccamt(Double accamt) {
        this.accamt = accamt;
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", accName=" + accName + ", accAddr=" + accAddr + ", accPan=" + accPan
                + ", accamt=" + accamt + "]";
    }

}

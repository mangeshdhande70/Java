package JdbcProject.All_In_One.com.dto;

public class Employee {


    private Integer empId;
    private String empName;
    private Integer mobNo;
    private String unit;

    private String photo;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getMobNo() {
        return mobNo;
    }

    public void setMobNo(Integer mobNo) {
        this.mobNo = mobNo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mobNo=" + mobNo +
                ", unit='" + unit + '\'' +
                '}';
    }
}

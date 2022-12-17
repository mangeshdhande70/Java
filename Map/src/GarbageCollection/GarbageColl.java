package GarbageCollection;


class Employee
{
    private String name;
    private Integer idNo;
    private String companyName;

    public String getName() {
        return name;
    }

    public Integer getIdNo() {
        return idNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNo(Integer idNo) {
        this.idNo = idNo;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString()
    {
        return name+" "+idNo+" "+companyName;
    }

}

public class GarbageColl {

    public static void main(String[] args) {


        Employee employee = new Employee();

        employee=null;

        System.gc(); // ----> calling garbage collector

        employee.setName("Akash");

        System.out.println(employee.getName());  // Exception occur bcz of Garbage Collector clear the Employee Object


    }


}

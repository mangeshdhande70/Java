package OPPS.src.Inheritance.HasARelationship.B__One_to_Many.Department;

// Single department has multiple employees

// Target
public class Department {

    String departmentName;
    Integer departmentId;

    Employeess []employee;

    public Department(String departmentName, Integer departmentId, Employeess[] employee) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.employee = employee;
    }

    public void getDepartmentDetails()
    {
        System.out.println("_____ Department Details _____");
        System.out.println("Department Name   :: "+departmentName
                           +"\nDepartment Id   :: "+departmentId+"\n");

        System.out.println("_____ Employee Details of "+departmentName+" department _____");

        for (Employeess emp:employee) {

            System.out.println("Employee Id   :: "+emp.employeeId+
                               "\nEmployee Name   :: "+emp.employeeName);
            System.out.println("____________________________________");

        }

    }



}

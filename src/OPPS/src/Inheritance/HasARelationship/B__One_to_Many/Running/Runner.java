package OPPS.src.Inheritance.HasARelationship.B__One_to_Many.Running;

import Inheritance.HasARelationship.B__One_to_Many.Department.Department;
import Inheritance.HasARelationship.B__One_to_Many.Department.Employeess;

public class Runner {


    public static void main(String[] args) {


        Employeess employee1 = new Employeess("Mangesh Dhande" , 1204343);
        Employeess employee2 = new Employeess("Vivek Peddaboina",102203);
        Employeess employee3 = new Employeess("Ashihs Dhok",1203434);

        Employeess[] emp = new Employeess[3];

        emp[0] = employee1;
        emp[1] = employee2;
        emp[2] = employee3;


        // Constructor Injection
        // Multiple injecting to one
        Department department = new Department("Eng",231,emp);
        department.getDepartmentDetails();


    }
}

package Inheritance.HasARelationship.A__One_to_One.Running;

import Inheritance.HasARelationship.A__One_to_One.pkg1.Account;
import Inheritance.HasARelationship.A__One_to_One.pkg1.Employee;

public class TestApp {


    public static void main(String[] args) {


        Account account = new Account(303675,"Mangesh Dhande","Salary");


        // One injecting to One
        Employee employee = new Employee("Mangesh Dhande",1024343,"ENG",account);

        employee.getEmployeeDetails();

    }


}

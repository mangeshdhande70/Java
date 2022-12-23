package Comparator.Employee;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



class Employee implements Comparable{

    private String empName;
    private Integer empId;
    private String unit;


    public Employee(String empName , Integer empId , String unit)
    {
        this.empName = empName;
        this.empId = empId;
        this.unit = unit;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "[empId - "+empId+"] ,     [Employee Name - "+empName+"] ,    [Unit - "+unit+"]";
    }

    @Override
    public int compareTo(Object o) {

        int empId1 = this.empId;

        Employee employee =(Employee) o;
        int empId2 = employee.empId;

        return (empId1 < empId2?-1:(empId1==empId2)?0:1);
    }
}

public class Runner {


    public static void main(String[] args) {


        Employee employee = new Employee("Shubham Kokode", 120421, "FSTAR");
        Employee employee1 = new Employee("Mangesh Dhande", 120434, "IOT");
        Employee employee2 = new Employee("Jayant Saheb", 120478, "IOT");
        Employee employee3 = new Employee("Vivek Peddaboina", 120451, "SAP");
        Employee employee4 = new Employee("Ashish Dhok", 120454, "IOT");
        Employee employee10 = new Employee("Vivek Khatri", 130451, "SAP");
        Employee employee5 = new Employee("Shradha kukude", 120494, "IOT");
        Employee employee6 = new Employee("Saurabh Parekar", 120221, "FSTAR");
        Employee employee9 = new Employee("Rakesh pawar", 129451, "SAP");
        Employee employee7 = new Employee("Ankit Kokode", 120021, "FSTAR");
        Employee employee8 = new Employee("ketan Dhande", 120721, "FSTAR");


        //Duplicates EMPID
        Employee employee11 = new Employee("Abhishek Bachhan", 120721, "FSTAR");
        Employee employee12 = new Employee("Suchit Durge", 129451, "SAP");
        Employee employee13 = new Employee("Ankush Wairagade", 120454, "IOT");



        TreeSet<Employee> treeSet = new TreeSet<>();

        treeSet.add(employee);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);
        treeSet.add(employee6);
        treeSet.add(employee7);
        treeSet.add(employee8);
        treeSet.add(employee9);
        treeSet.add(employee10);

        //Duplicate
        treeSet.add(employee11);
        treeSet.add(employee12);
        treeSet.add(employee13);

        System.out.println(treeSet);


        System.out.println("\n\n********** Employee Details with sorting Employee Id ***********");

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


            System.out.println("\n\n********** Employee Details with sorting Employee unit ***********");

            TreeSet<Employee> treeSet1 = new TreeSet<>(new MyComparator());

            treeSet1.add(employee);
            treeSet1.add(employee1);
            treeSet1.add(employee2);
            treeSet1.add(employee3);
            treeSet1.add(employee4);
            treeSet1.add(employee5);
            treeSet1.add(employee6);
            treeSet1.add(employee7);
            treeSet1.add(employee8);
            treeSet1.add(employee9);
            treeSet1.add(employee10);


            // Duplicates
            treeSet1.add(employee11);
            treeSet1.add(employee12);
            treeSet1.add(employee13);


//            System.out.println(treeSet1);


            Iterator iterator1 = treeSet1.iterator();

            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());

            }

        }
    }

class   MyComparator implements Comparator {
    public	int compare(Object obj1, Object obj2) {

       Employee e1 = (Employee) obj1;
       Employee e2 = (Employee) obj2;
        String s1 = e1.getUnit();
        String s2 = e2.getUnit();
        if (s1.equalsIgnoreCase(s2) && !e1.getEmpId().equals(e2.getEmpId()))
        {
            return 1;
        }
       return s1.compareTo(s2);
    }
}

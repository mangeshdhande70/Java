package Comparable.Base;

import javax.imageio.ImageTranscoder;
import java.util.Iterator;
import java.util.TreeSet;



class Employee implements Comparable{


    public String name;
    public int eId;

    public Employee(String name , Integer eId)
    {
        this.eId = eId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee Id : "+eId+"       Employee Name : "+name;
    }


    @Override
    public int compareTo(Object o) {

        Integer i1 = this.eId;

//        System.out.println(i1);

        Employee e = (Employee) o;

//        System.out.println(i2.eId);

        Integer i2 = e.eId;

        // Descending order
        return i2.compareTo(i1);
    }
}

public class CanWeOverrideCompareToMethod {


    public static void main(String[] args) {



        Employee employee = new Employee("Shubham Kokode " , 1204323);
        Employee employee1 = new Employee("Mangesh" , 1204343);
        Employee employee2 = new Employee("Jayant bhau" , 1204290);


        TreeSet treeSet = new TreeSet();
        treeSet.add(employee);
        treeSet.add(employee1);
        treeSet.add(employee2);
//        treeSet.add(0);
//        treeSet.add(10);

        System.out.println(treeSet);


        System.out.println("\n\n");


        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }

}

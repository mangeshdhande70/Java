/**

  * WeakHashMap is Dominated by Garbage collector and HashMap is Dominate the Garbage Collection
    this is only one difference between them.

 */



package WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;


class Students{

    private String name;
    private Integer rollNo;
    private String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString()
    {
        return rollNo+" ";
    }


    @Override
    public void finalize()
    {
        System.out.println("Finalize Method is called by Garbage Collector and it is Collecting Objects");
    }
}


public class WeakHashMap1 {

    public static void main(String[] args) throws InterruptedException {

        Students student = new Students();
        student.setRollNo(109);

        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(student , "Mangesh");
        System.out.println(weakHashMap);

        student = null; // eligible for Garbage Collector

        System.gc();  // call to Garbage Collector ----> internally calling finalize method.

        // WeakHashMap is Dominated by Garbage collector this is

        Thread.sleep(4000);
        System.out.println(student);

        System.out.println("Last Line"); //

    }
}

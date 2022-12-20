/**


  Garbage Collector internally call finalized method to clean the object from heap.


 */



package GarbageCollection;


import java.util.HashMap;

class Student{

    private String name ;
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

    int i;
    public Student(){
        this.i = 123;

    }


    @Override
    public void finalize()
    {
        System.out.println("Finalize Method is called by Garbage Collector and it is Collecting Objects");
    }
}

public class GarbageCallingFinalize {


    public static void main(String[] args) throws InterruptedException {

        Student student = new Student();
        student.setRollNo(109);

        HashMap hashMap = new HashMap();
        hashMap.put(student , "Mangesh");
        System.out.println(hashMap);

        student = null; // eligible for Garbage Collector

        System.gc();  // call to Garbage Collector ----> internally calling finalize method.

        // HashMap Dominating the Garbage Collector for which we have WeakHashMap Class

        Thread.sleep(4000);

        System.out.println(hashMap);

        System.out.println("Last Line"); //



    }


}

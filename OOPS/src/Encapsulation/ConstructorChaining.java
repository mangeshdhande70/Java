package Encapsulation;



class Student{

    private int rollNo=5;
    private String name;
    private String department;

    public Student(int rollNo, String name, String department) {
        this();
//        this.rollNo = rollNo;
//        this.name = name;
//        this.department = department;
    }

    public Student()
    {
        this.name = "Rahul";
        this.rollNo = 19;
        this.department = "CSE";
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {

        Student student = new Student(23,"Mangesh" ,"EE");

        System.out.println("ROLL No : "+student.getRollNo()+"\nSTUDENT NAME : "+student.getName()+
                           "\nDEPARTMENT : "+student.getDepartment());



    }




}

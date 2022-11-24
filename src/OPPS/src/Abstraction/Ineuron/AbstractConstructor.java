package OPPS.src.Abstraction.Ineuron;


abstract class Students{

    int rollNo;
    String name;
    String branch;

    public Students(int rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    abstract void getStudentDetails();

}

class Teacher extends Students{


    String classTeacher;
    String hod;


    public Teacher(int rollNo, String name, String branch,String classTeacher , String hod) {
        super(rollNo, name, branch);
        this.classTeacher = classTeacher;
        this.hod = hod;
    }

    @Override
    void getStudentDetails() {

        System.out.println("Student details");
        System.out.println("Name :: "+name);
        System.out.println("Roll No :: "+rollNo);
        System.out.println("Branch :: "+branch);
        System.out.println("ClassTeacher :: "+classTeacher);
        System.out.println("HOD :: "+hod);

    }

    void display()
    {
        System.out.println("In Child");
    }

}

public class AbstractConstructor {

    public static void main(String[] args) {

        Students students = new Teacher(32, "Akash", "CSE",
                "Dhara", "DJ Choudhary");

        students.getStudentDetails();
//        students.child();   not possible bcz Parent Reference
    }
}

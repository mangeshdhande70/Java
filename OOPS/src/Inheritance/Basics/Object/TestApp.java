package Inheritance.Basics.Object;

public class TestApp {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Akash";
        student.mailId = "akash@gmail.com";
        student.rollNo = 23; // Object Only use Instance Variable
//        student.marks = 60.6f;  Object can't use Local Variable
        student.display(student);


    }
}

package Abstraction.Ineuron;


abstract class AStudents{

    int rollNo;
    String name;
    String branch;
    char sex;

    public AStudents(int rollNo, String name, String branch, char sex) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.sex = sex;
    }

    abstract void details();
    abstract void m1();
}

public class AbstractUseInner {

    public static void main(String[] args) {

        AStudents students = new AStudents(23, "Akash", "CSE", 'M') {
            @Override
            void details() {

                System.out.println("Student Name :: " + name);
                System.out.println("Roll No :: " + rollNo);
                System.out.println("Branch  :: " + branch);
                System.out.println("Sex  :: " + sex);

            }

            @Override
            void m1() {
                System.out.println("Hello Guyssssss");
            }
        };

        students.details();
        students.m1();


    }

}

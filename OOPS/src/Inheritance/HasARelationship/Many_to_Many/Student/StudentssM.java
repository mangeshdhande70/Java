package Inheritance.HasARelationship.Many_to_Many.Student;

public class StudentssM {
    String studentName;
    String studentMailId;
    Integer studentId;

    Courses[] courses;

    public StudentssM()
    {

    }
    public StudentssM(String studentName, String studentMailId, Integer studentId, Courses[] courses) {
        this.studentName = studentName;
        this.studentMailId = studentMailId;
        this.studentId = studentId;
        this.courses = courses;
    }


    public void getStudentDetails() {


            int a=5;
            System.out.println("_____ Student Details  _____");
            System.out.println("Student Name   :: " + studentName + "\nStudent Id   :: " + studentId
                    + "\nStudent Mail ID   :: " + studentMailId );

            System.out.println("\n_____ Course Details of "+studentName +" _____");
            for (Courses c:courses){
                System.out.println("Course Name   :: "+c.getCourse());
                System.out.println("Course Fees  :: "+c.getCourseFees());
                System.out.println("Course Duration   :: "+c.getCourseDuration());
            }

            System.out.println();

        }

    }

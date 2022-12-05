package Inheritance.HasARelationship.Many_to_Many.Running;

import Inheritance.HasARelationship.Many_to_Many.Student.Courses;
import Inheritance.HasARelationship.Many_to_Many.Student.StudentssM;

public class TestApp {


    public static void main(String[] args) {

        Courses course1 = new Courses("Java",12000,5);
        Courses course2 = new Courses("FullStack Development",120909,6);
        Courses course3 = new Courses("Blockchain",3019019,10);

        Courses [] courses = new Courses[3];
        courses[0] = course1;
        courses[1] = course2;
        courses[2] = course3;


        StudentssM studentssM1 = new StudentssM("Ketan Dhande","kd@12gmai.com",3,courses);
        StudentssM studentssM2 = new StudentssM("Shital","shital12@gmail.com",89,courses);
        StudentssM studentssM3 = new StudentssM("Shakal","shakal2@gmail.com",100,courses);


        StudentssM s =new StudentssM();

        studentssM1.getStudentDetails();
        studentssM2.getStudentDetails();
        studentssM3.getStudentDetails();





    }

}

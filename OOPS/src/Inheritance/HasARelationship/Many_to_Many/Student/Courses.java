package Inheritance.HasARelationship.Many_to_Many.Student;


// Dependant Class
public class Courses {

    String course;
    Integer courseFees;
    Integer courseDuration;


    public Courses(String course, Integer courseFees, Integer courseDuration) {
        this.course = course;
        this.courseFees = courseFees;
        this.courseDuration = courseDuration;
    }

    public String getCourse() {
        return course;
    }

    public Integer getCourseFees() {
        return courseFees;
    }

    public Integer getCourseDuration() {
        return courseDuration;
    }
}

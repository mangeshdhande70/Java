package LaunchFirst;


enum Course
{
    JAVA,PYTHON,SPRING_BOOT; // how many constant that many times' constructor will called

    int courseId;

    Course()
    {
        System.out.println("Constructor");
    }

    // u can write method but not recommended.

    void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    int getCourseId()
    {
        return courseId;
    }

}


public class LunchEnum{

    public static void main(String[] args) {

         Course.JAVA.setCourseId(10);

//         Course.PYTHON = "AKASh";

         int cId = Course.JAVA.getCourseId();

         System.out.println();
         System.out.println(cId);



    }



}

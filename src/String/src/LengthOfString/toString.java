package String.src.LengthOfString;

public class toString {
    public static void main(String[] args) {

        Student obj = new Student(12, "mangesh");
        System.out.println(obj.rollno+" : "+obj.sName);

        System.out.println(obj);  // System.out.println(obj.toString()); both are same
                                  // if we not declare toString method then return pckgName.className + hashcode
                                  // we can also create toString method


    }

}
class Student {
    int rollno ;
    String sName;

    Student(int rollno , String sName){
        this.rollno = rollno;
        this.sName = sName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sName='" + sName + '\'' +
                '}';
    }
}

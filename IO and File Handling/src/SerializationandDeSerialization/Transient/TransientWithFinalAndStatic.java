package SerializationandDeSerialization.Transient;


import java.io.*;

class Student{


    /**
     * transient variable not participate in Serialization.
     */
    transient int stuId = 123;

    /**
     * final variable value is assign at compile time so, final transient variable are participate in Serialization.
     */
    final transient String name = "Ankit";

    /**
     * it is not object level value so, it won't participate in Serialization but u can access directly using ClassName
     */
    static transient String department = "CSE";


}


public class TransientWithFinalAndStatic {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Student s = new Student();

        System.out.println("Serialization Started..........");
        String fileName = "transient.ser";
        FileOutputStream o = new FileOutputStream(fileName);
        ObjectOutputStream os = new ObjectOutputStream(o);
        os.writeObject(s);
        System.out.println("Serialization Ended");

        System.in.read();

        System.out.println("De-Serialization started");
        FileInputStream f = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(f);
        Student ss = (Student) ois.readObject();

        System.out.println("Student Id :: "+ss.stuId);
        System.out.println("Student name :: "+ss.name);
        System.out.println("Student Department :: "+Student.department);

        System.out.println("De-Serialization Ended");



    }
}

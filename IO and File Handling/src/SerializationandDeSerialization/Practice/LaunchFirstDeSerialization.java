package SerializationandDeSerialization.Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LaunchFirstDeSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        System.out.println("De-Serialization Started..................");

        String fileName = "Practice.ser";
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student = (Student) objectInputStream.readObject();

        String userName = student.userName;

        String pass = student.pass;

        System.out.println("UserName :: "+userName);
        System.out.println("Password :: "+pass);

        System.out.println("De-Serialization ended.....................");


    }
}

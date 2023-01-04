package SerializationandDeSerialization.Practice;


import java.io.*;


public class LaunchFirst {


    public static void main(String[] args) throws IOException {

        Student student = new Student();

        String fileName = "Practice.ser";

        System.out.println("Serialization Started.......................");

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);

        os.writeObject(student);

        System.out.println("Serialization ended..................");


    }


}

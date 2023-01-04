package SerializationandDeSerialization.Basic;

import SerializationandDeSerialization.Practice.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "Practice.ser";

        FileInputStream fileInputStream = new FileInputStream(fileName);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

         Student student = (Student) objectInputStream.readObject();





    }

}

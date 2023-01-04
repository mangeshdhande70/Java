package SerializationandDeSerialization.ObjectGraph;

import java.io.*;

class Principle implements Serializable {

    Professor p = new Professor();

}

class Professor implements Serializable{

    Student s = new Student();

}

class Student implements Serializable{

    String studentName = "Ankit Jadhav";
}


public class ObjectGraph {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Principle p = new Principle();

        System.out.println("Serialization Started...........");

        String fileName = "GraphFile.ser";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("Serialization Ended............");

        System.in.read();


        System.out.println("De-Serialization Started..........");
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Principle p1 = (Principle) ois.readObject();

        System.out.println("Student Name ::"+p1.p.s.studentName);
        System.out.println("De-Serialization Ended..........");





    }


}

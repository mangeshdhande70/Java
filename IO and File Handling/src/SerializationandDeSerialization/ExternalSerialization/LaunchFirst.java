package SerializationandDeSerialization.ExternalSerialization;

import SerializationandDeSerialization.Practice.Student;

import java.io.*;

class Student2 implements Externalizable {

    String name = "Mangesh";
    String favMam = "Dhara";
    Integer sId = 1234;

    public Student2(){
        System.out.println("Constructor called..............");
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(sId);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = (String) in.readObject();
        sId = (Integer) in.readObject();
    }
}

public class LaunchFirst {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        System.out.println("Serialization Started..........");

        Student2 s = new Student2();
        String fileName = "external.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream o = new ObjectOutputStream(fileOutputStream);

        o.writeObject(s);


        System.out.println("Serialization Ended..........");

        System.in.read();

        System.out.println("De-Serialization Started..........");

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream);

        Student2 s2 = (Student2) objectInputStream1.readObject();



        System.out.println(s2.name + "----------->" + s2.sId);

        System.out.println("Serialization Ended..........");



    }


}

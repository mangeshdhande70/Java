package SerializationandDeSerialization.WithInheritance;


import java.io.*;
import java.nio.channels.FileLockInterruptionException;

class Animal implements Serializable {
    int animal = 123;
}

class Dog extends Animal{
    String name = "Jack";
}

public class LaunchFirst {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Serialization Started..........");

        Dog d = new Dog();

        String fileName = "inh.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream o = new ObjectOutputStream(fileOutputStream);

        o.writeObject(d);


        System.out.println("Serialization Ended..........");

        System.in.read();

        System.out.println("De-Serialization Started..........");


        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Dog d1 = (Dog)objectInputStream.readObject();

        System.out.println(d1.name+"----------->"+d1.animal);

        System.out.println("Serialization Ended..........");


    }
}

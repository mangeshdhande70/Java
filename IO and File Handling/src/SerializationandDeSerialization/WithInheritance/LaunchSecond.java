package SerializationandDeSerialization.WithInheritance;

import java.io.*;

class Animal1  {
    int animal = 123;
}

class Dog1 extends Animal1 implements Serializable{
    String name = "Jack";
}


public class LaunchSecond {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Serialization Started..........");

        Dog1 d = new Dog1();
        d.animal = 9999;
        d.name = "GermanShefrd";

        String fileName = "inhee.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream o = new ObjectOutputStream(fileOutputStream);

        o.writeObject(d);


        System.out.println("Serialization Ended..........");

        System.in.read();

        System.out.println("De-Serialization Started..........");


        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Dog1 d1 = (Dog1) objectInputStream.readObject();

        System.out.println(d1.name + "----------->" + d1.animal);

        System.out.println("Serialization Ended..........");
    }
}

package SerializationandDeSerialization.Basic;


import java.io.*;

//class Dog1 implements Serializable{
//
//    int i = 97;
//    int j = 90;
//
//}

class Cat implements Serializable {

    String name = "cat";
    String type = "Domestic";

}

public class LaunchSecond {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog dog = new Dog();
        Cat cat = new Cat();


        System.out.println("Serialization Started...........");

        String fileName = "SecondFile.ser";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);
        oos.writeObject(cat);
        System.out.println("Serialization Ended............");

        System.in.read();


        System.out.println("De-Serialization Started..........");
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dog1 = (Dog)ois.readObject();
        Cat cat1 = (Cat)ois.readObject();

        System.out.println("Cat object Data\n 1. Name ::"+cat1.name+" & 2.Type :: "+cat1.type);
        System.out.println("Dog object Data\n 1. Name ::"+dog1.name+" & 2. Age :: "+dog1.age);
        System.out.println("De-Serialization Ended..........");









    }
}

package SerializationandDeSerialization.SerialVersionUID;

import java.io.*;

public class Sender
{
    public static void main(String[] args)throws Exception
    {
        Dog d1 =new Dog();
        System.out.println("Serialization started.....");
        String fileName = "abc.ser";
        FileOutputStream fos   = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Serialization ended.....");
    }
}

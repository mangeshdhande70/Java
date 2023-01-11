package SerializationandDeSerialization.Basic;

import java.io.*;


/**

 * Serialization
 ==============================================================================================


 => In Java, serialization is the process of converting an object's state (including its variables) to
    a byte stream, which can then be stored or transmitted and reconstructed later on to create a new
    object with the same state. This can be useful for transferring data between systems, storing data,
    or for saving and restoring an object's state.


   => The process of saving (or) writing state of an object to a file is called serialization but strictly
      speaking it is the process of converting an object from java supported form to either network
      supported form (or) file supported form.

   =>  By using FileOutputStream and ObjectOutputStream classes we can achieve serialization process.
  					|=> writeObject(Object obj)



 * De-Serialization
 ==================================================================================================

  => The process of reading state of an object from a file is called DeSerialization but strictly speaking
     it is the process of converting an object from file supported form (or) network supported form to java
     supported form.

  =>  By using FileInputStream and ObjectInputStream classes we can achieve DeSerialization.
  					|=> readObject()


 */

class Dog implements Serializable {

    static {
        System.out.println("Static block.............");

    }

    Dog(){
        System.out.println("constructor started.................");
    }

    int age = 15;
    String name = "Labra";


}

public class LaunchFirst {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog d = new Dog();

        System.out.println("Serialization started.........");
        String fileName = "index.ser";
        FileOutputStream fo = new FileOutputStream(fileName);
        ObjectOutputStream ous = new ObjectOutputStream(fo);
        ous.writeObject(d);

        System.out.println("Serialization Ended.......");

        System.in.read();


        System.out.println("De-Serialization started...");

        FileInputStream fi = new FileInputStream("index.ser");
        ObjectInputStream ois = new ObjectInputStream(fi);
        Object obj = ois.readObject();
        Dog d1 = (Dog)obj;
        System.out.println("De-Serialization ended...........");


    }


}

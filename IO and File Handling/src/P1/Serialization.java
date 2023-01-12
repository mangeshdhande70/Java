package P1;


import java.io.*;

class NetflixUser implements Serializable {

    String userName = "mangesh.dhande";
    transient String pass = "md7@101198";

    transient int pin = 4354;


    private void writeObject(ObjectOutputStream o) throws IOException {

        System.out.println("writeObject method is called....");
        o.defaultWriteObject();

        String encyPws = "123"+pass;
        o.writeObject(encyPws);

        int encyPin = pin+12345;
        o.writeObject(encyPin);

    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

        ois.defaultReadObject();

        String encyPwd = (String) ois.readObject();

        pass = encyPwd.substring(3);

        Integer encyPin = (Integer) ois.readObject();
        pin = encyPin - 12345;


    }


}

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        NetflixUser user = new NetflixUser();

        System.out.println("Serialization started.........");
        String fileName = "ency.ser";
        FileOutputStream fo = new FileOutputStream(fileName);
        ObjectOutputStream ous = new ObjectOutputStream(fo);
        ous.writeObject(user);

        System.out.println("Serialization Ended.......");
    }
}
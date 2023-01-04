package SerializationandDeSerialization.Practice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

    String userName = "mangeshdhande";
    transient String pass = "Mangesh1111";


    private void writeObject(ObjectOutputStream fos) throws IOException {

        fos.defaultWriteObject();

        String encyPwd = "hey" + pass;

        fos.writeObject(encyPwd);


    }

    private void readObject(ObjectInputStream fis) throws IOException, ClassNotFoundException {

        fis.defaultReadObject();

        String encyPwd = (String) fis.readObject();

        pass = encyPwd.substring(3);

    }

}

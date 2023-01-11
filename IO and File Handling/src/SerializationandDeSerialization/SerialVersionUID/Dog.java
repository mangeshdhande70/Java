package SerializationandDeSerialization.SerialVersionUID;

import java.io.Serializable;

class Dog implements Serializable {
    private static final long serialVersionUID = 9L;
    int i = 10;
    int j = 20;

}

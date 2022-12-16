package List.Vectorr;

import java.util.Enumeration;
import java.util.Vector;

public class Vectirrr {


    public static void main(String[] args) {


        Vector vector = new Vector();

        vector.add(45);
        vector.add(46);
        vector.add(12);
        vector.add(3);

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements())
            System.out.print(enumeration.nextElement()+" ");


    }


}

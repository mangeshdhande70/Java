/*
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 */


import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {

//        Integer i = new Integer(4);   // Integer is a class

          int i1 = 5;
//        Integer i3 = new Integer(i1);  //Boxing
          Integer i2 = i1;               //Autoboxing

        System.out.println(i2);

        int k = i2.intValue();  //unBoxing
        int j = i2;            //AutoUnboxing

        ArrayList<Integer> list = new ArrayList<>();  // use


        String str = "123";

        int value = Integer.parseInt(str); // using integer class we can convert String into int
        System.out.println(value);

        String val = "4.5";

        float f = Float.parseFloat(val); // Only String to any no is possible not viceversa
        System.out.println(f);






    }
}

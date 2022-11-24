package String.src.LengthOfString;

/**

 The SCP is an area inside the heap memory. It contains the unique strings. In order to put the strings
 in the string pool, one needs to call the intern() method. Before creating an object in the string pool,
 the JVM checks whether the string is already present in the pool or not. If the string is present,
 its reference is returned.

 */

public class Intern {


    public static void main(String[] args) {


        String value1 = "Hello";
        String value2 = value1.intern();

        String value3 = new String("Hello").intern();


        System.out.println("value1 := "+value1+"  Value2 := "+value2);

        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        System.out.println("\n\nValue1 & Value3");
        System.out.println(value1 == value3);
        System.out.println(value1.equals(value3));

        System.out.println("\n\nValue2 & Value3");
        System.out.println(value2 == value3);
        System.out.println(value2.equals(value3));


        double d = Math.round(2.5 + Math.random());
        System.out.println(d);


        System.out.println("\n\n");
        String v1 = new String("Hello");
        String v2 = new String("Hello").intern();

        System.out.println();
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));

    }


}

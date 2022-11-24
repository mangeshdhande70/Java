package WrapperClasses.src.WrapperCls;

import javax.sql.rowset.spi.SyncFactoryException;

/**

 1. To implement autoboxing concept in wrapper class a buffer of object will be created at the time of
    class loading.

 2. During AutoBoxing,if an object has to be created first jvm will check whether the object is already
    available inside buffer or not.

 3. If it is available, then JVM will reuse the buffered object instead of creating a new Object.

 4. If the Object is not available inside buffer, then jvm will create a new object in the heap area,
    this approach improves the performance and memory utilization


 But this buffer concept is applicable only for few cases
 1. Byte     => -128 to +127
 2. Short   => -128 to +127
 3. Integer=> -128 to +127
 4. Long    =>  -128 to +127
 5. Character =>  0 to 127
 6. Boolean   => true,false
 In the remaining cases new object will be created.


 NOTE: Not applicable for Float & Double

 */

public class BufferObject {

    public static void main(String[] args) {


        Integer x = 10;
        Integer y = 10;
        System.out.println(x == y);

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);

        Integer i = 1000;  // new obj
        Integer j = 1000;  // new obj ...limit exceed
        System.out.println(i == j);



        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1==b2);

        Character c1 = 'c';
        Character c2 = 'c';
        System.out.println(c1==c2);



        Integer x1 = 128;
        Integer y1 = 128;
        System.out.println(x1 == y1);//false

        Integer a1 = 127;
        Integer b3 = 127;
        System.out.println(a1 == b3);//true

        Boolean b11 = true;
        Boolean b22 = true;
        System.out.println(b11==b22);//true

        Double d1 = 10.0;
        Double d2 = 10.0;
        System.out.println(d1==d2);//false


        Boolean bbb = true;
        Boolean bbbb = false;

        System.out.println(bbb == bbbb);





    }



}

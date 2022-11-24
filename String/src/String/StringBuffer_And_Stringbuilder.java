package String;

public class StringBuffer_And_Stringbuilder {

    public static void main(String[] args) {

        String str = new String("Mangesh");
        str.concat(" Dhande"); // here original string will not modified
        System.out.println(str);

        /* A thread-safe, mutable sequence of characters. A string buffer is like a String,
         but can be modified. At any point in time it contains some particular sequence of characters,
         but the length and content of the sequence can be changed through certain method calls.
         String buffers are safe for use by multiple threads.

        Note :  Always go through StringBuffer bcz it's provide safe-Synchronization  */

        StringBuffer sb = new StringBuffer("Mangesh");
        sb.append(" Dhande"); // here original String will modified
        System.out.println(sb);


        /* A mutable sequence of characters. This class provides an API compatible with StringBuffer,
         but with no guarantee of synchronization.
         */

        StringBuilder stringBuilder = new StringBuilder("Mangesh");
        stringBuilder.append(" Dhande");
        System.out.println(stringBuilder);

    }
}

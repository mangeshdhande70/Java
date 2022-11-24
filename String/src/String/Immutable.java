package String;

public class Immutable {

    public static void main(String[] args) {

        String str1 = "Mangesh";  // here we use string pool memory
        String str2 = "Mangesh";

        System.out.println(str1 == str2); // == check address
        System.out.println(str1.equals(str2)); // check String is same or not

        str1 = "Rakesh";   // here str1 create new object bcz String is Immutable i.e string cannot be modified
                           // existing value cannot be change

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


        String s = new String("Mangesh");   // here we use heap memory
        String s1 = new String("Mangesh");

        System.out.println(s==s1); // false
        System.out.println(s.equals(s1)); // true


        String name ="Mangesh";
        name = "Akash";
        System.out.println(name);


        String strr = "hello"; // 1st object Hello ..... this object and below object are created in sep memory
        strr = strr + " world"; // 2nd object hello World... this is new object
        System.out.println(strr);

        String  strr1 = "hello";
        strr1.concat("World");
        System.out.println(strr);

    }


}

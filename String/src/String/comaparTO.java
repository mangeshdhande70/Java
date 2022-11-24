package String;

public class comaparTO {
    public static void main(String[] args) {
        String s1 = "Akash";
        String s2 = "Mangesh";

        System.out.println(s1.compareTo(s2));

        String s3 = "Rakesh";
        String s4 = "Rakesh";

        System.out.println(s3.compareTo(s4)); // both string are same hence, ans is 0.

        String s5 = "A";
        String s6 = "a";
        System.out.println(s6.compareTo(s5));


        String s7 = "lion";
        String s8 = "zebra";
        System.out.println(s7.compareTo(s8));  // l = 12 and z =26  ---- 12 - 26 = -14



    }
}

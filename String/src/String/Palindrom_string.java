package String;

public class Palindrom_string {

    public static void main(String[] args) {
        String pal = "ABBAA";
        String reverse ="";

        for (int i = pal.length() - 1; i >= 0 ; i--) {
            reverse += pal.charAt(i);

        }
//        System.out.println(reverse);
        if (pal.equals(reverse))
            System.out.println("String is Palindrome string");
        else
            System.out.println("Not palindrome String");
    }
}

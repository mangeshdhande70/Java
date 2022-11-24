package String.src.LengthOfString;

import java.util.Scanner;

public class rever_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String original = sc.nextLine();
        String rev ="";

        for (int i = original.length() - 1; i >= 0 ; i--) {

            rev += original.charAt(i);

        }

        System.out.println("Original String : " + original);
        System.out.println("Reverse String : "+rev );


        StringBuffer sb = new StringBuffer(original);
        String reverse = sb.reverse().toString();
        System.out.println("Reverse String using buffer : "+ reverse);
//        System.out.println(sb.reverse().toString()); // not work bcz String is Immutable

    }
}

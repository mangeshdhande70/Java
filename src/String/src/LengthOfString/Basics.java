package String.src.LengthOfString;

public class Basics {
    public static void main(String[] args) {

        // String literals
        String s1 = "Mangesh";

        String s2 = "Mangesh";  // s1 and s2 are ref to same object , object in string constant pool.

        System.out.println(s1==s2);  // this check same address or not " here the both s1 and s2 are ref to same object
        System.out.println(s1.equals(s2)); // this check char or string same or not


        String s3 = new String("Mangesh");
        String s4 = new String("Mangesh");

        System.out.println(s3==s4); // here s3 and s4 are created their own object that's why they are diff .
        System.out.println(s3.equals(s4));


        String s5 = "Basket";
        String s6 = "Cat";
        System.out.println(s5.charAt(0) > s6.charAt(0));
        System.out.println(s5.charAt(2) > s6.charAt(1));

        String s7 = "A";
        String s8 = "a";
        System.out.println(s7.charAt(0) < s8.charAt(0));

        System.out.println(s1.concat(s2));

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.codePointCount(1,7));
        System.out.println(s7.compareTo(s8));

        System.out.println(s1.substring(3,5)); // 3 is including and 5 is excluding

        System.out.println(s1.substring(2)); // beggining from index 2 to last

        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());


        String s9 =" "; // here space is count
        System.out.println(s9.length()); // length is 1
        System.out.println(s9.isEmpty()); // here string have space
        System.out.println(s9.isBlank()); // but string is blank



        String s10 =""; // no space
        System.out.println(s10.length()); // length is 0
        System.out.println(s10.isEmpty()); // here string doesn't have space and if length is zero then string is empty
        System.out.println(s10.isBlank()); // but string is blank


        String str1 = "mangesh";
        System.out.println(str1.replace("m"  , "n"));
        System.out.println(str1.trim());
        System.out.println(str1);

       char[] s = {'M' ,'a' ,'n','g' , 'e', 's' , 'h'};
       String ss = new String(s);
       System.out.println(ss);


    // String using new keyword
        String str2 = new String("Rakesh");
        System.out.println(str2);


    }
}

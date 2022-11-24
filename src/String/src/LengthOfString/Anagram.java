package String.src.LengthOfString;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s = "LISTEN";
        String t = "SILENT";
        if (isAnagram(s , t))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");


    }

    public static boolean isAnagram(String s , String t)
    {
        s = s.toLowerCase();
        t = t.toLowerCase();
        boolean ans = false;

        if (s.length() == t.length())
        {
            char [] str = s.toCharArray();
            char [] str2 = t.toCharArray();

            Arrays.sort(str);
            Arrays.sort(str2);

            ans  = Arrays.equals(str , str2);
        }
        System.out.println(ans);
        if (ans)
            return true;
        else
            return false;
    }

}

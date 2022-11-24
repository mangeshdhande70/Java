package String.src.LeetCode;

import java.util.Arrays;

public class ShuffleString {

    public static void main(String[] args) {

       String s = "codeleet";
       int [] indices = {4,5,6,7,0,2,1,3};

       char [] ch = s.toCharArray();
       char [] ch1 = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            ch1[indices[i]] = ch[i];


       System.out.println(new String(ch1));


    }


}

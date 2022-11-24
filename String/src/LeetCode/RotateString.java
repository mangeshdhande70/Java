package LeetCode;
// 796. Rotate String

public class RotateString {

    public static void main(String[] args) {

        String s = "abcde" , goal = "cdeab";

        if (s.length() != goal.length())
            System.out.println("Not a Rotate String");
        else if ((s+s).indexOf(goal) >= 0)
            System.out.println("Rotate String");
        else
            System.out.println("Not a Rotate String");




//        String s = "abcde", goal = "cdeab";
//        String s1 = "";
//        int k = 0;
//        String c = "";
//        boolean flag = false;
//        for (int i = 1; i < s.length(); i++) {
//            c += s.charAt(k);
//            k++;
//            s1 = s.substring(i, s.length()) + c;
//            if (s1.equals(goal)) {
//                flag = true;
//            }
//        }
//
//        if (flag)
//            System.out.println("yes");
//        else System.out.println("no");
//



    }

}

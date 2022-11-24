package String.src.LeetCode;

public class LengthofLastWord {


    public static void main(String[] args) {

        int l = 0;
        char c = ' ';
        String s = "   fly me   to   the moon  ";
        s = s.trim();

        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i) == c )
            {
                break;
            }
            else {
                l++;
            }
        }
        System.out.print(l);

        String s2 ="Mangesh Dhande";
        String [] s3 = s2.split(" ");

        System.out.print(s3[s3.length-1].length());


    }


}

package String.src.LeetCode;

public class RepeatedStringMatch {


    public static void main(String[] args) {

        String a = "a", b = "aa";



        int count =1 ;

        while (a.indexOf(b) < 0)
        {
            a+=a;
            count++;
        }

        System.out.println(count);



    }

}

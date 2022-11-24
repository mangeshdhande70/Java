
package String;

public class Pangram {

    public static void main(String[] args) {


        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        s = s.replace(" ","");

        char [] charArray = s.toCharArray();

        int [] array = new int[26];

        for (int i = 0; i < charArray.length  ; i++) {

            array[charArray[i] - 65]++;
        }

        boolean flag = true;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0)
            {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("String is Pangram");
        else System.out.println("String is not Pangram");


    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCollectionSort {

    public static void main(String[] args) {

        List l = new ArrayList<>();

        l.add("aaA");
        l.add("Aad");
        l.add("AAb");
        l.add("Aac");
        l.add("aAA");

        Collections.sort(l);

        System.out.println(l);


        String a = "AB";
        String b = "AC";

        System.out.println(a.charAt(1)>b.charAt(1)); // C is greater


    }


}

package Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class LaunchCountString {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("paro");
        arrayList.add("prashant");
        arrayList.add("ankit");
        arrayList.add("rakesh");
        arrayList.add("koko");


        Long res = arrayList.stream().filter(name->name.length()>4).count();

        System.out.println(res);



    }
}

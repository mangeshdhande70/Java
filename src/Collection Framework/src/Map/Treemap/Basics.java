import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Basics {
    public static void main(String[] args) {

       // Creating
        TreeMap<Integer,String > treeSet = new TreeMap<>();

       // Inserting
        treeSet.put(1,"Mangesh");
        treeSet.put(2,"golya");
        treeSet.put(5,"Rakesh");
        treeSet.put(3,"Dhiraj");
        treeSet.put(4,"Vivek");


        System.out.println(treeSet);

        // Removing
        treeSet.remove(1);
        treeSet.remove(4);

        System.out.println(treeSet);


        TreeMap<String,Long > treeSet2 = new TreeMap<>();

        treeSet2.put("Mangesh" , 7030765414L);
        treeSet2.put("Rakesh" , 90487534984L);
        treeSet2.put("Dhiraj" , 70357583L);

        System.out.println(treeSet2);
        System.out.println(treeSet2.get("Mangesh"));
        System.out.println(treeSet2.get("rakesh"));


        for (Map.Entry<String,Long> m : treeSet2.entrySet())
            System.out.println(m);


        for (Map.Entry<Integer,String> s : treeSet.entrySet())
            System.out.println(s);


    }
}

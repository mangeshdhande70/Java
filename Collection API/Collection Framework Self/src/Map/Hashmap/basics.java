package Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class basics {
    public static void main(String[] args) {


        HashMap<Integer , String> map = new HashMap<>();

        map.put(1," Mangesh");
        map.put(45," Paro");
        map.put(80," Jay");
        map.put(81 , " Jay");
        map.put(82," Shubhs");

        System.out.println(map);

        map.put(81," Aksh");
        System.out.println(map);

        if (map.containsKey(1))
            System.out.println("Set contain 1 and value is"+map.get(1));


        // traversing and printing
        System.out.println();
        for(Map.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e);
        }


    }

}

import java.util.*;

public class Base {

    public static void main(String[] args) {

        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Inserting
        set.add(45);
        set.add(55);
        set.add(45);
        set.add(56);
        set.add(55);
        set.add(57);
        set.add(58);

        System.out.println(set);  // Not store duplicates elements

        //removing
        set.remove(56);
        System.out.println(set);

        //searching
        if (set.contains(45))
            System.out.println("Set contain 45");

        if (!set.contains(56))
            System.out.println("Set could not contain 56");


        //Fetching or traversing

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());


            // Set To List
            List<Integer> list = new ArrayList<>();

            list.addAll(set);
            System.out.println(list);
        }

    }


}

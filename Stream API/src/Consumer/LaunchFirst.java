package Consumer;


import java.util.ArrayList;
import java.util.function.Consumer;

class MyConsumer implements Consumer<String>
{


    @Override
    public void accept(String name) {

        System.out.println("accept method called......");
        System.out.println(name);


    }
}

public class LaunchFirst {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("mangesh");
        arrayList.add("prashant");
        arrayList.add("akash");


        System.out.println("\n\n**** Using Traditional Approach ********");
        // Traditional Concept
        Consumer<String> consumer = new MyConsumer();
        arrayList.forEach(consumer);
        System.out.println();


        System.out.println("\n\n**** Using Lambda expression Consumer ********");

        //Lambda Expression
         arrayList.forEach(name -> System.out.println(name));


         System.out.println("\n\n**** Using Method reference Consumer ********");

         //method reference
         arrayList.forEach(System.out::println);


    }


}

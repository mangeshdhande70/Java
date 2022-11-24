package String;

@FunctionalInterface
interface FI{

    int getLength(String s);

}

public class Lambda {

    public static void main(String... ar){

        FI fi = s -> s.length();

       System.out.println(fi.getLength("Nikhil"));

    }

}

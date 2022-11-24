public class HashCode {
    public static void main(String[] args) {


        String s1 = "Mangesh";
        String s2 = "Mangesh";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Integer a = 23;
        Integer b = 23;

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(2306996&15);

    }
}

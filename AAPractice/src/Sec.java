public class Sec {


    public static void main(String[] args) {

        System.out.println(sum(500));
        System.out.println(123>>2);
        System.out.println(123<<2);
        System.out.println(23<<2);

    }

    static int sum(int n)
    {
        if (n==1) {
            return 1;
        }
        else {
            return n + sum(n - 1);
        }

    }

}

package LeetCode;

public class Print_0_to_N {

    public static void main(String[] args) {

        fun(5,0);


    }

    static void fun(int n,int i)
    {
        if (n==i) {
            System.out.println(i);
            return;
        }
        System.out.println(i);
        fun(n , ++i);

    }

}

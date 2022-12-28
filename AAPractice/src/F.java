public class F {
    public static void main(String[] args) {
        System.out.println(fun(5,2));

    }

    static int fun(int x, int y) {
        if (x == 0)
            return y;
        else
            return fun(x - 1, x + y);
    }
}

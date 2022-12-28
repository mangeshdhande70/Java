public class First {


    public static void main(String[] args) {

        System.out.println(sum(50000));

    }


    static int sum(int n)
    {
        int sum=0;
        while (n!=0)
        {
            sum+=n--;

        }
        return sum;

    }

}

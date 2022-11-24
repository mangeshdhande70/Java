public class swap {
    public static void main(String[] args) {
        swap s = new swap();

        int [] a = {9,10};
        s.swap(a,0,1);
        System.out.println("a[0] = " +a[0]+" & a[1] = "+a[1] );
    }
    public  void swap(int arr[],int a,int b)
    {
        mangesh m = new mangesh();
        System.out.println(m.a);
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];


    }
}
class mangesh{
    int a = 89;
}
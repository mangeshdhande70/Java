package QP;

public class ith {
    public static void main(String[] args) {
        int dec = 13;
        int bit = 1;
        int arr[] = new int[50];
        dec_bin(arr, dec);
        int a = 1<<(bit - 1);

        if ((dec & a)==0){
            System.out.println(bit+"th bit is 0");
        }
        else {
            System.out.println(bit+"th bit is 1");
        }


    }

    static void dec_bin(int a[], int dec){
        int i =0;
        while (dec > 0){
            a[i++] = dec%2;
            dec/=2;
        }
//        for (int j = i -1 ; j >= 0 ; j--) {
//            System.out.print(a[j]+ " ");
//
//        }
    }
}

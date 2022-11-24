// if a array contain all duplicates elements except one, then find that unique no.

package find_a_unique_no_in_array_;

public class duplo {
    public static void main(String[] args) {
        int a[] = {12,34,43,12,43,34,98};
        sort(a,a.length);
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
        int i= 0;
        while ( i < a.length -1){
            if ((a[i] ^ a[i+1])==0)
            {
                i+=2;
            }
        }
        System.out.println(i);
        System.out.println(a[i]);
    }
    public static void sort(int a[] , int n){
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i+1; j < n ; j++) {
                    if (a[min_index] > a[j])
                    {
                        min_index = j;
                    }
            }
            swap(a,min_index,i);

        }
    }
    public static void swap(int a[] , int min_index , int i){
//        a[min_index] = a[min_index] ^ a[i];
//        a[i] = a[min_index] ^ a[i];
//        a[min_index] = a[min_index] ^ a[i];
        int temp = a[i];
        a[i] = a[min_index];
        a[min_index] = temp;
    }


}

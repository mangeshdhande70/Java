package Practice;

public class BubbleSort {


    public static void main(String[] args) {
        
        int arr[] = {3,2,1,4,2,0,1};

        int c[] = arr;
        System.out.println(arr.hashCode());
        bubbleSorting(arr , arr.length);

        for (int a :
                arr) {
            System.out.print(a+" ");
        }

        System.out.println("\nBoth will be same");
        for (int a :
                c) {
            System.out.print(a+" ");
        }
        
    }
    
    
    static void bubbleSorting(int a[] , int length )
    {
        System.out.println(a.hashCode());

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length-i; j++) {
                if (a[j] < a[j-1])
                {
                    swap(a , j);
                }
            }

        }
        
    }
    
    static void swap(int arr[] , int j)
    {
        arr[j] = arr[j]^arr[j-1];
        arr[j-1] = arr[j]^arr[j-1];
        arr[j] = arr[j]^arr[j-1];
        
    }        
    
}

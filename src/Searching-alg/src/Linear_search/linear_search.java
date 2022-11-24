package Searching;

public class linear_search {
    public static void main(String[] args) {
        int target = 7;
        int [] arr = {12,4,6,5,90};
        int target_index = search(arr , arr.length , target);
        if (target_index==-1)
        {
            System.out.println(target+" Not Found in array");
        }
        else
         System.out.println(target+" Found at "+target_index+" Index");
    }
    public static int search(int []a , int size , int target){
        for (int i = 0; i < size; i++) {
            if (a[i]==target){
                return i;
            }
        }
        return -1;
    }
}

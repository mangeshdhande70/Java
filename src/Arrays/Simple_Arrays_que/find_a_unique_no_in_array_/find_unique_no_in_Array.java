// if a array contain all duplicates elements except one, then find that unique no.


package Arrays.Simple_Arrays_que.find_a_unique_no_in_array_;

public class find_unique_no_in_Array {
    public static void main(String[] args) {
        int a[] = {2,2,3};
        int unique=0;
        for (int i: a){
            unique^= i;

        }
        System.out.println(unique);
    }
}

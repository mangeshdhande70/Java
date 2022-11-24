import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int [] arr = {4,1,3,5,3,2,3};

        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(4,1,3,5,3,2,3));

        treeset t = new treeset();

        t.show((ArrayList<Integer>) l);

    }


}

class treeset{

    public void show(ArrayList<Integer> arr){

        treeset.insertion_sort(arr , arr.size());
        treeset.removeDuplicates(arr , arr.size());
        for (int i : arr){
            System.out.print(i+" ");
        }

    }

    public static void insertion_sort(ArrayList<Integer> arr , int n)
    {
        for (int i = 0; i <= n-2 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr.get(j) < arr.get(j - 1)){
                    swap(arr , j);
                }
                else {
                    break;
                }
            }

        }

    }
    public static void swap(ArrayList<Integer> a, int j)
    {
        int temp = a.get(j);
        a.set(j, a.get(j - 1));
        a.set(j - 1, temp);
    }

    public static ArrayList removeDuplicates(ArrayList<Integer> arr, int n){

        if (n==0 || n==1)
            return arr;
        int[] newArr = new int[n];
        List<Integer> list = new ArrayList<>();

        int j =0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1))
            {
                arr.remove(arr.get(i));
                System.out.println(arr.get(i));
            }
            else
            {
                newArr[i] = arr.get(i);
//                list.add(arr.get(i));
            }
        }
//        newArr[j++] = arr.get(n - 1);

//                arr.addAll(newArr);

        for (int i = 0; i < newArr.length; i++) {

            arr.set(i, newArr[i]);
        }
        System.out.println(arr.toString());
        return arr;

    }
}


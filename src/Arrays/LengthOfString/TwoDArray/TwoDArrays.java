package Arrays.LengthOfString.TwoDArray;

public class TwoDArrays {

    static int a = 5;
   static char c;

    public static void main(String[] args) {
        int [][] arr = new int[3][4];

        arr[0][2] = 34;
        arr[1][3] = 45;

        System.out.println(c);



        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

        TwoDArrays.print();
    }

    public static void print(){
        System.out.println(a);
    }

}

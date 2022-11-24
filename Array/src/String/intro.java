package String;

public class intro {


    public static void main(String[] args) {

//        int []a = {2,3,5,7,9};
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(a[i]);
//
//        }

        // Enhance version to print arrays


        int []array = new int[5];

        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        for(int i : array)
        {
            System.out.print(i+" ");
        }

        System.out.println("\n********* Reverse of arrays ***********");
        for (int i = 4; i >= 0 ; i--) {

            System.out.print(array[i]+ " ");

        }

        System.out.println("\n********* Reverse of arrays ***********");

        int mid = (array.length - 1 ) / 2;
//       System.out.println(mid);
        int  j = array.length-1;
        for (int i = 0; i < mid ; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }

        for (int i= 0 ; i < 5;i++) {
            System.out.print(array[i] +" ");

        }



    }

}

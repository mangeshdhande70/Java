package QP;

public class dec_to_bin_AND_Viceversa {
    public static void main(String[] args) {
        int dec = 14;
        int bin[] = new int[50];
        System.out.println("**** DECIMAL TO BINARY ****");
        dec_to_bin(bin , dec );
        System.out.println("\n");
        System.out.println("**** DECIMAL TO OCTAL ****");
        dec_to_octal(bin , dec);

        System.out.println("\n");

         System.out.println("**** BINARY To DECIMAL ****");
        int binary = 1110;
        bin_to_dec(binary);


    }

    public static void dec_to_bin(int bin[] ,  int dec ){
            int i = 0;
            while (dec > 0)
            {
                bin[i] = dec%2;
                dec=dec/2;
                i++;
            }
            for (int b = i-1 ; b >= 0; b--)
            {
                System.out.print(bin[b]);
            }
        }

        public static void bin_to_dec(int bin){

        int count = 0;
        int dec = 0;
        while (bin != 0) {
            int rem = bin%10;
            dec += rem*Math.pow(2, count);
            count++;
            bin = bin /10;
        }
        System.out.println();
        System.out.println(dec);



        }

       public static void dec_to_octal(int array[] , int dec){
        int i = 0;
        while (dec > 0){

            array[i++] = dec%8;
            dec/= 8;

        }
           for (int j = i-1; j >= 0 ; j--) {
               System.out.print(array[j]);

           }

       }

}


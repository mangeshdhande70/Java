package Find_mid_of_aaray.src;

public class Mid {

    public static void main(String[] args) {

        int [] a= {1,8,9,30,80,90};

        int low = 0 , high = a.length-1;

        int mid = (low + high) / 2;
        System.out.println(mid);

        mid = low + (high - low)/ 2;
        System.out.println("\n"+mid);  // best

        mid = (6) >>> 1;   // best
        System.out.println(mid);



    }
}

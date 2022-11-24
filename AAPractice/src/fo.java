public class fo {


    public static void main(String[] args) {
        if (true)
        {
            System.out.println("heloo");
        }
        else {
            System.out.println("hhhhh");
        }


        for (int i = 0; i++<5 ; i++) {
            System.out.println("hello");
            i=i++; // no matter

        }

        int a[] = {0,2,4,1,3};
        for (int i = 0; i <a.length ; i++) {
             a[i] = a[(a[i]+3)/a.length];
        }
        System.out.println(a[1]);

        int i=0,j=5;
        for (; i < 3 && j++<10;) {
            System.out.print(""+i+""+j);
            i++;

        }
        System.out.print(""+i+""+j);

        System.out.println();

        String s1 = new String("dhoni");
        String s2 = new String("dhoni");

        System.out.println(s1==s2);

        String s3 ="dhoni";
        String s4 = "dhoni";

        System.out.println(s3==s4);


        String s = new String("sachin");
        s.concat("tendulkar1");
        s+="IND";
        String s9=s.concat("MI");
        System.out.println(s);
        System.out.println(s9);

        String ss = new String("you cannot change me");

        String ss1 = ss + "Change me";

        System.out.println();


        int arr[] = {1,2,3};
        int arr2[] = {1,2,4,5};
        arr2 = arr;
        for (int x:arr2)
            System.out.print(x+":");

        System.out.println();

        int aaa[] = new int[2];
        aaa[0] = 5;
        aaa[1] = 6;
        aaa = new int[4];
        aaa[2] = 10;
        aaa[3] = 11;
        for (int aa:aaa)
            System.out.print(aa+" ");


        String[] str = {"sun","mun","tue"};
        int w=0;
        for (String st : str) {
            switch (st)
            {
                case "sun":
                case "mun": w-=1;break;
                case "tue": w=w+1;

            }
            System.out.println(w);
        }

        int c[][] = new int[2][4];
        c[0] = new int[] {1,3,5,7};
        c[1] = new int[] {1,3};

        for (int v[] : c){
            for (int vv : v)
                System.out.print(vv+" ");
        }
        System.out.println();

    }





}

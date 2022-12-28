package Arrays;

import java.util.Scanner;

public class InfyPower {

    public static void main (String[] args) throws java.lang.Exception
    {
        int ansM = 0;
        int ansA = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("size1");
        int in1 = s.nextInt();

        int a[] = new int[in1];
        for(int i=0;i<in1;i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println("size2");
        int in2 = s.nextInt();
        int m[] = new int[in2];
        for(int i=0;i<in2;i++)
        {
            m[i] = s.nextInt();
        }

        System.out.println("String : ");
        String inputString = s.next();

        if(inputString.equalsIgnoreCase("Even"))
        {
            for(int i=0;i<m.length;i+=2){
                ansM += m[i] - a[i];
                ansA += a[i] - m[i];
            }
            if(ansA>ansM)
                System.out.println("Andrea");
            else if(ansA<ansM)
                System.out.println("Maria");
            else
                System.out.println("Tie");
        }
        else{
            for(int i=1;i<m.length;i++)
            {
                ansM += m[i] - a[i];
                ansA += a[i] - m[i];
            }
            if(ansA>ansM){
                System.out.println("Andrea");
            }
            else if(ansA<ansM){
                System.out.println("Maria");
            }
            else{
                System.out.println("Tie");
            }
        }


    }


}

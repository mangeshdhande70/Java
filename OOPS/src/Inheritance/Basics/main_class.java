package Inheritance.Basics;

public class main_class {
    public static void main(String... args) {

        int n1 = 7;
        int n2 = 5;


        Ultracalc obj = new Ultracalc();

         int res1 = obj.add(n1 , n2);
         int res2 = obj.sub(n1 , n2);
         int res3 = obj.mul(n1 , n2);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);


        cal2 c2 = new cal2();
       // cal2 cc2 = new cal1();  we cannot create this object bcz cal1 is super class and it doesn't knows what is inside cal2

        cal1 cc = new cal2();

        System.out.println(cc.add(n1,n2));
        /* System.out.println(cc.sub(n1,n2)); we can't access sub bcz its belong to child class and not accessible form
         super but child class can access the methods of it's parent or super class */

        int res = c2.add(n1,n2);
        System.out.println(res);

        int res21 = c2.sub(n1,n2);
        System.out.println(res21);


    }

}

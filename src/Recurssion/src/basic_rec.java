package Recurssion.src;

public class basic_rec {
    public static void main(String[] args) {

        basic_rec obj = new basic_rec();
        obj.print(1);

    }
    public void print(int n){
        if (n == 5){                       // base condition
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

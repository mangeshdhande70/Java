package Recurssion.src;

public class Fibbonacci {

    public static void main(String[] args) {
        int n=5;
        int fib = fibb(n);
        System.out.println(fib);
    }
    public static int fibb(int n){
        if (n<2){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
}

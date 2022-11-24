package Operator;

public class Ternery_Op {
    public static void main(String[] args) {

        int i=5,j=7;

        int res = i>j?i:j;
        System.out.println(res);


        int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result
                = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "
                + result);


    }
}

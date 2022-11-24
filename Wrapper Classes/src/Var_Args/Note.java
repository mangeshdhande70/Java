package Var_Args;


class A{

    public void display(int[] a)
    {
        System.out.println(a);
        for (int a1:a) {
            System.out.print(" "+a1);
        }System.out.println();
    }

}


public class Note {

    public static void main(String[] args) {

        A obj = new A();
        obj.display(new int[] {120,344,554,45});
//        obj.display(10,304,505);  -- we can't pass this into int[] a but in Var args both are possible

    }
}

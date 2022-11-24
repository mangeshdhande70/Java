package OPPS.src.Polymorphism.Overloading.Example;

public class Calculator {

    public static void main(String[] args) {

        Operations op = new Operations();

       System.out.println(op.add(3,4));
       System.out.println(op.add(3,4,5));
       System.out.println(op.add(3,4.5f));
       System.out.println(op.add("A" , 4));

       int add = 'A' + 34;
       System.out.println(add);


    }
}

public class mainClass {
    public static void main(String[] args) {
        Dstack obj = new Dstack();

       obj.push(56);
       obj.push(45);
       obj.show();
       System.out.println();
       System.out.println("Size of Stack is "+obj.size());

       obj.push(40);
       obj.push(98);
       obj.show();
       System.out.println();
       System.out.println("Size of Stack is "+obj.size());


    }
}

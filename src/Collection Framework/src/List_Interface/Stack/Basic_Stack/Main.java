public class Main {
    public static void main(String[] args) {

        System.out.println("Enter size of Stack");
        Stack s = new Stack();
        s.push(52);
        s.push(92);
        s.push(89);
        s.push(59);
        s.push(90);
        s.push(789);
        s.pop();
        s.pop();
        s.pop();
        s.peek();
        s.show();
        s.isEmpty();
        int n = s.search(90);
        if (n == -1)
            System.out.println("Element not present in satck");
        else
            System.out.println("Element found at index No. "+n);

    }
}

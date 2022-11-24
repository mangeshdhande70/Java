package List;

public class LinkedList {


    static class Node
    {
        int data;
        Node next;
    };

    // Function to create newNode in
    // a linkedlist
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
    Node head;


    public static void show(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public static void main(String[] args) {

        Node head1 = newNode(1);
        head1.next = newNode(1);
        head1.next.next = newNode(2);


        Node head2 = newNode(1);
        head2.next = newNode(3);
        head2.next.next = newNode(4);

        Node nodes  = merge(head1 , head2);

        show(nodes);


    }

    public static Node merge( Node n1 , Node n2)
    {
        if (n1 == null)
            return n1;
        if (n2 == null)
            return n2;
        if (n1.data < n2.data)
        {
            n1.next = merge(n1.next, n2);
            return n1;
        }
        else
        {
            n2.next = merge(n1, n2.next);
            return n2;
        }

    }

}

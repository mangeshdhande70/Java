package List_Interface.LinkedList.Doubly;

public class LinkedList {

    Node head ;

    public void insertionAtbegEle(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
        {
            head = newNode;
            return;
        }
        newNode.next_node = head;
        head = newNode;

    }

    public void insertionAtIndex(int i,int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        Node n = head;
        if (head == null)
            insertionAtbegEle(data);
        for (int j = 0; j < i - 1; j++) {
            n = n.next_node;
        }
        newNode.prev_node = n;
        newNode.next_node = n.next_node;
        n.next_node = newNode;

    }

    public void insertionAtEnd(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null)
        {
            insertionAtbegEle(data);
            return;
        }
        Node n = head;
        while (n.next_node != null)
        {
            n = n.next_node;
        }
//       System.out.println(n.data);
        newNode.prev_node = n.next_node;
        n.next_node = newNode;
        newNode.next_node = null;

    }

    public void deletionAtindex(int index)
    {
        Node n = head;
        if (head == null)
            return;

        for (int i = 0; i < index - 1 ; i++) {
            n = n.next_node;
        }
        n.next_node = n.next_node.next_node;
//        System.out.println(n.next_node.data);
        n.prev_node = n;
//        System.out.println(n.prev_node.data);

    }

    public void show()
    {
        Node n= head;
        while ( n.next_node != null)
        {
            System.out.print(n.data+" ");
            n = n.next_node;

        }
        System.out.println(n.data);
    }
//
////    public void size()
////    {
////        Node n = head;
////        while ()
//    }

}

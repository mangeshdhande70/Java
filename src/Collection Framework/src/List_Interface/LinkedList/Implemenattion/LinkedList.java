public class LinkedList {
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;

        }
    }

    public void insertAtBeg(int data){

        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAfter(Node prev_node , int data )
    {
        if (prev_node == null) {
            System.out.println("previous not cannot be Null");
            return;
        }
        Node node = new Node();
        node.data = data;
        node.next = prev_node.next;
        prev_node.next = node;
    }
    public void insertAtIndex(int index , int data)
    {
        if (head == null)
        {
            insertAtBeg(data);
        }
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        for (int i = 0; i < index -1 ; i++) {

            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void removeFromIndex(int index){

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node n = head;
        for (int i = 0; i < index -1 ; i++) {
            n = n.next;
        }
//        Node node  = new Node();
        n.next = n.next.next;

    }

    public void removelast()
    {
        if (head == null)
            return;

        Node n = head;
        while (n.next.next != null)
        {
            n = n.next;
        }
//        System.out.println();
//        System.out.println(n.data);
        n.next= null;

    }

    public void removeFirst()
    {
       if (head == null)
           return;

       head = head.next;
//       head.next = null;


    }



    public void show()
    {
        Node n = head;
        System.out.println();
        while (n.next != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.print(n.data);
    }

}

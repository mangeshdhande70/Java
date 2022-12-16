package List_Interface.LinkedList.Implemenattion;

public class RunnerMain {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(45);
        list.insert(98);
        list.insert(100);
        System.out.println();
        list.show();

//        System.out.println();
        list.insertAtBeg(42);
        list.show();

//        System.out.println();
        list.insertAfter(list.head.next.next , 99);
        list.show();


        list.removeFromIndex(2);
        list.show();


        list.insertAtIndex(2, 46);
        list.show();

//        System.out.println();
//        System.out.println("After Remove from Last");
        list.removelast();
        list.show();

        list.removeFirst();
        list.show();

    }
}

public class Runner {
    public static void main(String[] args) {



        LinkedList list1 = new LinkedList();

        System.out.println();


        list1.insertionAtEnd(12);
        list1.insertionAtEnd(14);
        list1.insertionAtEnd(15);
        list1.show();

        System.out.println();
        list1.insertionAtIndex( 2 , 13);
        list1.show();

        System.out.println();
        list1.insertionAtbegEle(11);
        list1.show();

        System.out.println();
        list1.deletionAtindex(2);
        list1.show();







    }
}

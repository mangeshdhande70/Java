package CustomizedGeneric.GeneriMethods;


import java.util.ArrayList;

class Demo1{


    public void method(ArrayList<String> a)
    {

        a.add("Mangesh");
        a.add("Ketan");

//        a.add(45);

        System.out.println(a);

    }


}



public class Practice {


    public static void main(String[] args) {

        Demo1 demo1 = new Demo1();

        ArrayList<String> arrayList = new ArrayList();

//        arrayList.add(45);
        arrayList.add("Ankit");
        arrayList.add("Nitin");

        demo1.method(arrayList);


        ArrayList<Integer> arrayList1 = new ArrayList();

        arrayList1.add(45);
//        demo1.method(arrayList1);

    }


}

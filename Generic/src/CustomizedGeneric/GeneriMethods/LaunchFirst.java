/**

 * Can we apply TypeParameter at MethodLevel?
 ---> 	Ans.Yes, it is possible.




 Which of the following declarations are allowed?

 1. ArrayList<String> l1=new ArrayList<String>();//valid

 2. ArrayList<?> l2=new ArrayList<String>();//valid

 3. ArrayList<?> l3=new ArrayList<Integer>();//valid

 4. ArrayList<? extends Number> l4=new ArrayList<Integer>();//valid

 5. ArrayList<? extends Number> l5=new ArrayList<String>();//invalid

 6. ArrayList<?> l6=new ArrayList<? extends Number>(); //invalid

 7. ArrayList<?> l7=new ArrayList<?>(); //invalid




 Conclusions :

 Generics concept is applicable only at compile time, at runtime there is no such type of concept.
 At the time of compilation, as the last step generics concept is removed,hence for jvm generics syntax
 won't be available. Hence, the following declarations are equal.

 ArrayList l=new ArrayList<String>();
 ArrayList l=new ArrayList<Integer>();
 ArrayList l =new Arraylist<Double>();

 All are equal at runtime,because compiler will remove these generics' syntax
 ArrayList l=new ArrayList();




 Behind the scenes by the compiler
 =============================
 1. Compiler will scan the code
 2. Check the argument type
 3. if Generics found in the argument type remove the Generics syntax
 4. Compiler  will again check the syntax



 **/



package CustomizedGeneric.GeneriMethods;

import java.util.ArrayList;
import java.util.Iterator;


class Demo<T>
{

    void method(T t)
    {
        System.out.println("value : "+t);
    }

}

class Custom{

    /**
     1. methodOne(ArrayList<String>al):

     * This method is applicable for ArrayList of only String type.
     * Within the method we can add only String type of objects and null to the List.

     **/
    void display(ArrayList<String> a)
    {

        a.add("akash");
        a.add("mangesh");
//        a.add(20); only string can allow
        System.out.println(a);

    }



    /**

     2.  methodOne(new ArrayList<String>());
         methodOne(new ArrayList<Integer>());
         methodOne(new ArrayList<Runnable>());


     * We can use this method for ArrayList of any type but within the method we can't add anything
       to the List except null.

     * This method is useful whenever we are performing only read operation.

     **/
    void travers(ArrayList<?> a)
    {

        // a.add(56); you can not add any object bcz we don't know which object will replace
        // ? is only use for read operations


        a.add(null);  // only null accepted bcz of every object byDefault value is null.
        a.add(null);
        System.out.println("       "+a);


    }

    /**


     3. methodOne(ArrayList<? extends X> al)
          X -> class, we can make a call to method by passing ArrayList of X type or its Child type.
          X -> interface, we can make a call to method by passing ArrayList of X type or its Implementation class.


     * if X is class, We can use this method for ArrayList of Number or its Child class Type
      (Byte,Short,Integer,Float,Double,Long) but within the method we can't add anything to the List except null.

     *  if X is interface, We can use this method for ArrayList of Comparable or, it's implementing class
        Comparable Interface is Implemented by All Wrapper Classes and string.

     * This method is useful whenever we are performing only read operation.

     **/


    // for class
    void methodForClassExtends(ArrayList<? extends Number> variable)
    {

        System.out.println("             * Traversing using For-each *");
        System.out.print("                 ");
        for (Number num :
                variable) {
            System.out.print(num +" ");
        }



        System.out.println("\n \n             * Traversing using Iterator *");
        System.out.print("                 ");
        Iterator iterator = variable.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() +" ");
        }

    }


/**  in interface, We can use this method for ArrayList of Comparable or, it's implementing class
       Comparable Interface is Implemented by All Wrapper Classes and string. **/
    void methodForInterfaceExtends(ArrayList<? extends Comparable> variable)
    {
      variable.add(null);

      System.out.print("                 ");
      Iterator iterator = variable.iterator();
      while (iterator.hasNext())
      {
          System.out.print(iterator.next()+" ");
      }

    }


    /**

 4. methodOne(ArrayList<? super X> al)
         X -> class, we can make a call to method by passing ArrayList of X type or its super class
         X -> interface, we can make a call to method by passing ArrayList of X type or its super class
              of implementation class of x.

         methodOne(ArrayList<? super X> al){
         al.add(X);
         al.add(null);

 Note:  here u can add X type data
 }
      **/

/** String class, we can make a call to method by passing ArrayList of String type or its super(Object) class
    here u can add String type data into Arraylist **/
  public void methodForClassSuper(ArrayList<? super String> variable)
  {

      variable.add(null);
      variable.add("Yo Bro");
//      variable.add(45);
      variable.add("Bhai Bhai");;;;;;;;;;;;;;;;;;;

      System.out.print("                 ");;;;;;;;;;;;;;;;;;;;;;;;;;;;;
      Iterator iterator = variable.iterator();
      while (iterator.hasNext())
      {
          System.out.print(iterator.next()+" ");
      }

  }
;;;;;;;;;;;;;;;;;;;;


  public void methodForInterfaceInterface(ArrayList<? super Comparable> variable)
  {
      variable.add(null);

      variable.add("asdasda");
      variable.add(345);
      variable.add(32323214234l);
      System.out.print("                 ");
      Iterator iterator = variable.iterator();
      while (iterator.hasNext())
      {
          System.out.print(iterator.next()+" ");
      }

  }
  }



public class LaunchFirst {


    public static void main(String[] args) {

        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(45);
        arrayListInteger.add(65);
        arrayListInteger.add(900000);



        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("Ketan");
        arrayListString.add("Rakesh Loudu");
        arrayListString.add("ankit Loudu");

        Custom custom = new Custom();
       // custom.display(arrayListInteger);  not call bcz display method on accept String ArrayList

        custom.display(arrayListString);


        System.out.println("\n\n****************** Using ? Generics ***********************************");


        System.out.print("                 ");
        System.out.println("* Integer *");
        custom.travers(arrayListInteger);
        System.out.print("\n\n                   ");
        System.out.println("* String *");
        custom.travers(arrayListString);





        System.out.println("\n\n****************** Using ? Bounded generics with extends ***********************************");

        ArrayList arrayList = new ArrayList();
        arrayList.add(45);
        arrayList.add(46.6);
        arrayList.add(90.5f);
        arrayList.add(4567L);


        System.out.println("             ********* For Class Bounded using extends *********");
        custom.methodForClassExtends(arrayList);
       // launchFirst.method(arrayListString); CE bcz we Bounded the generic to Number only

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(98);
        arrayList1.add(100.6);
        arrayList1.add(34535.5f);
        arrayList1.add(456734l);
        arrayList1.add("Mangesh");

        System.out.println("\n\n               ********* For Interface Bounded using extends ********");
        custom.methodForInterfaceExtends(arrayList1);



        System.out.println("\n\n****************** Using ? Bounded generics with super ***********************************");



        System.out.println("\n\n                ********* For Class Bounded using super  *********");
        ArrayList arrayList2 =  new ArrayList();
        arrayList2.add(65);
        arrayList2.add(98);
        arrayList2.add(100.6);
        arrayList2.add(34535.5f);
        arrayList2.add(456734l);
        arrayList2.add("Mangesh");

        custom.methodForClassSuper(arrayList2);


        System.out.println("\n\n             ********* For Interface Bounded using super  *********");
        ArrayList arrayList3 =  new ArrayList();
        arrayList3.add(65);
        arrayList3.add(98);
        arrayList3.add(100.6);
        arrayList3.add(34535.5f);
        arrayList3.add(456734l);
        arrayList3.add("Mangesh");

        custom.methodForInterfaceInterface(arrayList3);






        System.out.println("\n\n************************************* ");
        Demo<String> demo = new Demo<>();
        demo.method("akash");

//        int u = 5;
//       Integer i = Integer.valueOf(u);
//
//       int b = i.intValue();
//
//       String v = i.toString();
//       System.out.println(v);




     Integer x = 45 , y=40;

     int res = m(x,y);
     System.out.println(res);

    }

    // compareTo internal
    static int m(int x,int y)
    {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);

    }

    }



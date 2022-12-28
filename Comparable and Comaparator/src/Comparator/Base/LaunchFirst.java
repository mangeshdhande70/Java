/**

 Comparator(I)
 =====================================================================================================

 * This Interface Present in java.util Package.It contains 2 Methods compare() and equals().

 * public boolean equals(Object o);

        Whenever we are implementing Comparator Interface Compulsory we should Provide Implementation for
        compare().Implementing equals() is Optional because it is Already Available to Our Class from
        Object Class through Inheritance.

 *

 *  public  int compare(Object obj1, Object obj2);
                    Returns –ve if and Only if obj1 has to Come Before obj2.
                    Returns +ve if and Only if obj1 has to Come After obj2.
                    Returns 0 if and Only if obj1 and obj2 are Equal.





 Syntax
 -------------------------------------------------------------------------------------

             public interface java.util.Comparator<T> {

                        public abstract int compare(T, T);
                        public abstract boolean equals(java.lang.Object);

              }



 Note: If we are Not satisfied with Default Natural Sorting Order OR if Default Natural
 Sorting Order is Not Already Available then we can Define Our Own Sorting by using Comparator Object.




 * Syntax
 ---------------------------------------------------------------------------------

         public interface java.util.Comparator<T> {

                 public abstract int compare(T, T);
                 public abstract boolean equals(java.lang.Object);

         }


 */


package Comparator.Base;


import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {

        int i1 = (int)o1;
        int i2 = (int) o2;

        return (i1 > i2 ?-1:(i1==i2)?0:1);




    }


}

public class LaunchFirst {


    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(10);


        System.out.println(treeSet);


    }



}

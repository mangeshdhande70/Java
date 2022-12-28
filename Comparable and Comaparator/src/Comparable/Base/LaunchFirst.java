/**

 Comparable
 ========================================================================================================


 * It is a functional interface present in java.lang package, it contains Only One Method compareTo().

 * Whenever we are Depending on Default Natural Sorting Order and if we are trying to Insert Elements
   then Internally JVM will Call compareTo() to IdentifySorting Order.

 * This interface is internally used by TreeSet object during sorting process of the Object.

 * Note:
       If we are keeping the data inside TreeSet object, then the data should be
  			a. Homogenous ====> because it uses compareTo() to sort the Object
  			b. The object should compulsorily implement an interface called "Comparable".
        if we fail to do so , it would result in "ClassCastException".

 * All Wrapper classes and String class has implemented "Comparable" interface.
   until 10.9V StringBuffer class has not implemented Comparable interface, so the above program would
   result in "ClassCastException" but now in java 11.0v StringBuffer class implements Comparable.

 * If we are Depending on Default Natural Sorting Order Compulsory Objects should be Homogenous and Comparable.
   Otherwise, we will get RE: ClassCastException.
   An object is said to be Comparable if and only if corresponding class implements Comparable interface.


 * obj1.compareTo(obj2)
  			|=> returns -ve value, if obj1 has to come before obj2
  			|=> returns +ve value, if obj1 has to come after  obj2
  			|=> returns 0 value, if both obj1 and obj2 are equal


 Syntax
 --------------------------------------------------------------------------------------------------

         @FunctionalInterface
         public interface java.lang.Comparable<T> {

                 public abstract int compareTo(T);

         }

 */





package Comparable.Base;

public class LaunchFirst {
}

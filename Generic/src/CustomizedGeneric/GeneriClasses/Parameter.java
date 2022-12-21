/**

* on TypeParameter you can use only extends either it is class or interface.


 Valid TypeParameter
 --------------------------------------------------------------------

      1. class Demo< T extends Number&Comparable , V extends String>
      2. class Demo< T extends Object&Comparable , V extends String>
      3. class Demo< T extends Object&Comparable , V extends Object&Comparable>
      4. class Test <T extends Number&Runnable> {}//valid
             Number -> class
             Runnable-> interface

               - in 4th case while creating object if you put Integer instead of Number you will get CE.
               - the given class should be implements that interfaces.

     5. class Test<T extends Number&Runnable&Comparable> {} //valid
                 Number -> class
                 Runnable-> interface
                 Comparable -> interface

     6. class Test<T extends Runnable&Comparable> {} //valid
                 Runnable-> interface
                 Comparable -> interface




  Invalid
 ------------------------------------------------------------------------

 1.class Demo< T extends Integer&Comparable , V extends String&Comparable ></>
     -- ( java.lang.Comparable cannot be inherited with different arguments: <> and <java.lang.String )

 2. class Test<T extends Runnable&Number> {}//invalid
         Runnable-> interface
         Number -> class
         rule: first inherit and the implement so invalid

 */

package CustomizedGeneric.GeneriClasses;


import java.util.ArrayList;
import java.util.HashMap;

// on TypeParameter you can use only extends either it is class or interface.
class CustomWithExtends<T extends Number&Comparable,V extends Object&Comparable>{

    T key ;
    V value;

    public CustomWithExtends(T key , V value)
    {
        this.key = key;
        this.value = value;

    }

    void display()
    {

        System.out.println("Key : "+key+"    value : "+value);

    }

}




class Custom<T,V>{

    T key ;
    V value;

    public Custom(T key , V value)
    {
        this.key = key;
        this.value = value;

    }

    void display()
    {

        System.out.println("Key : "+key+"    value : "+value);

    }

}


public class Parameter {


    public static void main(String[] args) {

        System.out.println("********** Using Custom ***********");

        // compiler check only LHS not RHS so program executed successfully.
        Custom<Integer,String> custom = new Custom("mangesh","Ketan");
        custom.display();



        System.out.println();
        Custom<Integer,String> custom1 = new Custom(1,"Ketan");
        custom1.display();



        System.out.println("********** Using CustomWithExtends ***********");

        // compiler check LHS and calling class with bounded class hence, program generate CE
     // CustomWithExtends<Integer,String> customWithExtends1 = new CustomWithExtends<>("mangesh","Ketan");



        CustomWithExtends<Integer,String> customWithExtends1 = new CustomWithExtends<>(2,"Ketan");
        customWithExtends1.display();






    }


}

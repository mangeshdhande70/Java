/**


 Which of the following are valid?
      *   class Test <T extends Number&Runnable> {}//valid
             Number -> class
             Runnable-> interface

      *  class Test<T extends Number&Runnable&Comparable> {} //valid
             Number -> class
             Runnable-> interface
             Comparable -> interface

      * class Test<T extends Number&String> {} //invalid
               We can't extends more than one class at a time.

      * class Test<T extends Runnable&Comparable> {} //valid
              Runnable-> interface
              Comparable -> interface

      * class Test<T extends Runnable&Number> {}//invalid
                 Runnable-> interface
                 Number -> class
                 rule: first inherit and the implement so invalid




 Keypoint's about bounded types
 ------------------------------------------
     => We can't define bounded types by using implements and super keyword
        But implements keyword purpose we can replace with extends keyword.

         eg: class Test<T implements Runnable>{}//invalid
         class Test<T super String>{}//invalid




     => As the type parameter we can use any valid java identifier but it convention to use T always.

                  eg: class Test<T>{}
                  class Test<iNeuron>{}




     => We can pass any no of type parameters need not be one.

                     eg: class HashMap<K,V>{}
                     HashMap<Integer,String> h=new HashMap<Integer,String>();

 */






package CustomizedGeneric.GeneriClasses;

class Student<T>
{
    T type;

    public Student(T type)
    {
        this.type = type;
    }

    public T getObject()
    {
        return  type;
    }

    public void show(){
        System.out.println("The type of object is :"+type.getClass().getName());
    }

}


public class LaunchFirst {

    public static void main(String[] args) {


        Student<Integer> student1 = new Student<Integer>(10);
        student1.show();
        System.out.println(student1.getObject());


        System.out.println();

        Student student = new Student(45);
        student.show();
        System.out.println(student.getObject());


        System.out.println();

        Student<String> student2 = new Student<String>("Gaur Gopal Das");
        student2.show();
        System.out.println(student2.getObject());


        System.out.println();

        Student<Double> student3 = new Student(45.9);
        student3.show();
        System.out.println(student3.getObject());

        System.out.println();

        Student<Double> student4 = new Student(45);
        student4.show();
        System.out.println(student4.getObject());


    }


}

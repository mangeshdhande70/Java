/**


 Keypoints about bounded types
 ------------------------------------------
     => We can't define bounded types by using implements and super keyword
        But implements keyword purpose we can replace with extends keyword.

     eg: class Test<T implements Runnable>{}//invalid
     class Test<T super String>{}//invalid

 */






package CustomizedGeneric;

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


        Student<Integer> student1 = new Student<Integer>(23);
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

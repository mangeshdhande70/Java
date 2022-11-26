package Inheritance.ObjectReference;

class Parent{

    Integer i ;

    public void display()
    {
        System.out.println(i);
    }

}


public class Child extends Parent{

    Integer i;

    public static void main(String[] args) {

        Parent parent1 = new Parent();

        Child child1 = new Child ();

        Parent parent3 = (Parent) child1;

    //  Child child3 = (Child) parent1; // ---> ClassCastException

        Child child2 = child1;

        Object o = (Object) parent1;

//        String str1 = (String) b1;

        Parent parent2 = (Parent) child1;
        parent2.display();


    }

    public void d()
    {
        System.out.println("Hello Inside child");
    }


}

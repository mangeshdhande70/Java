package OPPS.src.Inheritance.Basics.Object;

public class Student {

    String name;
    Integer rollNo;
    String mailId;

    public Student(String name, Integer rollNo, String mailId) {

        int a = 78;
        this.name = name;
        this.rollNo = rollNo;
        this.mailId = mailId;
        System.out.println(a);
        fun();  // this is also a special method so we can call methods from constructor.
    }

    public Student(){

    }

//    display();  Calling a method is a action and action (method) can call from only methods.
    public void display(Student s)
    {
        fun();
        Float marks=34.0f;
        boolean result;

//        System.out.println(a);

        System.out.println("Name :: "+s.name);
        System.out.println("Roll No  :: "+s.rollNo);
        System.out.println("Mail Id  :: "+s.mailId);
//        System.out.println("Marks  :: "+s.marks);   Object cannot use Local Variable
//        System.out.println("Result :: "+s.result);

    }

    public void fun()
    {
        System.out.println("Inside a Fun");
//        fun(); StackOverflow

    }



}

package OPPS.src.Abstraction.Ineuron;


abstract class Person{

    String name;
    Integer age;
    String sex;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void display()
    {
        System.out.println("Name :: "+name+"\nAge :: "+age+"\nSex "+sex);
    }
}

class Student extends Person{
    Integer sId;
    Float marks;

    public Student(String name, Integer age, String sex,Integer sId,Float marks) {
        super(name,age,sex);
        this.sId = sId;
        this.marks = marks;
    }

    public void display()
    {
        display();
        System.out.println("");
    }
}

public class Runner {

    public static void main(String[] args) {

        Person person = new Student("Nalkya Rakesh",24,"female",34,98.0f);

    }

}

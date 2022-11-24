package OPPS.src.Inheritance.Interface;


interface math{

    float increse();
    void display();
  }

class student implements math{

    float pi = 3.14f;
    @Override
    public float increse() {
        {
            System.out.println(pi);
        }
        return pi;
    }

    @Override
    public void display() {
        System.out.println("In display");
    }
}

public class Interface {

    public static void main(String[] args) {

        math obj = new student();
        obj.increse();

    }

}

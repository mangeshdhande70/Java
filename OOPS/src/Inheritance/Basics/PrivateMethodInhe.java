package Inheritance.Basics;

class Parent {

    private void display() {
        System.out.println("Inside private display in Parent");
    }

}

public class PrivateMethodInhe extends Parent{


    public void display1()
    {
        System.out.println("Inside a display1() in PrivateMethodInhe");
    }

    public static void main(String[] args) {


        Parent parent = new PrivateMethodInhe();

//      parent.display();   --- Not Accessible bcs display is private

//        parent.display1();  -- Not accessible bcz parent not know about its child class methods.

        PrivateMethodInhe privateMethodInhe = new PrivateMethodInhe();

        privateMethodInhe.display1();

    }
}

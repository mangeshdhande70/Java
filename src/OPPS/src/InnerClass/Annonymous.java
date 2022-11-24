package OPPS.src.InnerClass;

class Display{

    public void display()
    {
        System.out.println("Inside Class Display display Method");
    }
}

public class Annonymous {

    public static void main(String[] args) {

        Display obj = new Display(){   // Anonymous class
            public void display()
            {
                System.out.println("Inside Anonymous class");
            }

        };
        obj.display();

        Display d = new Display();
        d.display();

    }


}

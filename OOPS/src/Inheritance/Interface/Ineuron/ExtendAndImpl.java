package Inheritance.Interface.Ineuron;


class Demo{
    public void display()
    {
        System.out.println("Inside class Demo");
    }
}
interface Interface {
    void display();
}

class App extends Demo implements Interface{   // always use extends first

}

public class ExtendAndImpl {
    public static void main(String[] args) {

        Interface anInterface = new App();
        anInterface.display();

    }


}

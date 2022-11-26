package InnerClass;


interface Interface{

    public abstract void display();

}

public class InterfaceImplementByInnerClass {


    public static void main(String[] args) {


        Interface anInterface = new Interface() {  // ---> this is called as Inner anonymous class
                @Override
                public void display() {

                    System.out.println("I'm implementing interface inside inner class");
                }
            };
        anInterface.display();
        }

}

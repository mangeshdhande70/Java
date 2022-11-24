package OPPS.src.InnerClass;

/**
 que: can we declare main() method inside inner class?
 ans - yes but there was a issue while running program and get a error could not find or load Main method.
 */

class Outer{

    int a = 9;

    protected void display()
    {
        System.out.println("Inside Outer class..... a = "+a);
    }

    public class Demo {

        public static void main(String[] args) {

            Outer o = new Outer();


        }


    }


}


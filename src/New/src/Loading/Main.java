/**

 until we create Object .class file for that class will not loaded

 */



package Loading;

class P{
   // until You create object .class file can't be loaded
    static {
        System.out.println(".class File loaded of class P");
    }

}

class Q{

    static {
        System.out.println(".class file loaded of class Q");
    }
}

public class Main {

    public static void main(String[] args) {

        Main m = new Main();

        Q obj = new Q();

    }
}

package String;

public class basics {

    public static void main(String[] args) {

        Alien obj1 = new Alien();
        Alien obj2 = new Alien();

        obj2.name = "Mangesh";

        System.out.println("*** FOR First OBJECT ***");

        System.out.println(obj1.name);
        System.out.println(obj1.age);

        System.out.println("*** FOR SECOND OBJECT ***");
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }


}

class Alien extends Object {    // every class in java extends object class

    int age = 16;
    int salary = 10000;
    String name = "Akash";

}
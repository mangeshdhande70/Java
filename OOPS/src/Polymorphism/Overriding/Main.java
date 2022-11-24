package Polymorphism.Overriding;

public class Main {

    public static void main(String args[]){
        Car2 obj = new Car2();
        obj.run();

        Car1 obj1 = new Car3();
        obj1.run();
       // obj1.breaks(); // not accessible

        Car2 obj2 = new Car3();
        obj2.gear();
        obj2.run();
       // obj2.breaks(); // not Accessible

       // Car3 obj3 = new Car2(); // we can't create parent object via child reference


    }
}

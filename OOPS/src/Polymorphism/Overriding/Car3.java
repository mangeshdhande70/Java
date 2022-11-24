package Polymorphism.Overriding;

class Car3 extends Car2 {

    void run(){
        System.out.println("Vehicle is moving");
    }
    void gear(){
        System.out.println("in first gear ");
    }

    void breaks(){
        System.out.println("in Car 3 rohit press a break ");
    }
}
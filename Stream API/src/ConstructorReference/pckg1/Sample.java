package ConstructorReference.pckg1;

public class Sample{

    String name;
    Integer id;

    public Sample(String name, Integer id) {
        this.name = name;
        this.id = id;
        System.out.println("constructor calling........ ");
    }

//    @Override
//    public void display(String name , Integer id){
//
//        System.out.println("Name :: "+name);
//        System.out.println("Id :: "+id);
//
//    }

}

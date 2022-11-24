package OPPS.src.Static;

public class Ineuron {

    public static void main(String[] args) {
        Folks a1 = new Folks();

        Ineuron obj = new Ineuron();
        obj.fun2();


        a1.age = 18;
        a1.name = "Shubham";

      System.out.println(a1.name);
      System.out.println(a1.age);
      System.out.println(Folks.tech);


      System.out.println("**********************");


      Folks a2;

      a2 = new Folks();
      a2.age = 20;
      a2.name = "Chintu";

      Folks.tech = "Blockchain";



        System.out.println(a2.name);
        System.out.println(a2.age);
        System.out.println(Folks.tech);


       Folks.Stat_function();

       a1.fun();


    }

    public void fun2(){

        System.out.println("Inside fun2");


    }


}

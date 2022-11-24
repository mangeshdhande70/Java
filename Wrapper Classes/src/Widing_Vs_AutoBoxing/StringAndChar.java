package Widing_Vs_AutoBoxing;


class Parent{

    public void display(String s)
    {
        System.out.println("Inside String arg,  s = "+s);
    }
    public void display(Character s)
    {
        System.out.println("Inside Character arg,  s = "+s);
    }

}



public class StringAndChar {

    public static void main(String[] args) {


        Parent parent = new Parent();
        parent.display("c");
        parent.display('c');


    }


}

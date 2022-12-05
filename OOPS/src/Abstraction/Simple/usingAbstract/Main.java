package Abstraction.Simple.usingAbstract;

public class Main
{
    public static void main(String[] args) {

        Phone obj = new Iphone();
        show(obj);

        System.out.println();

        Phone s = new Samsung();
        show(s);

    }

    public static void show(Phone p)
    {
        p.cellConfig();
    }
}


abstract class Phone{

    public abstract void cellConfig();

    class In{
        int i =9;
        void display()
        {
            System.out.println("Hello");
        }
    }
}

class Iphone extends Phone{

    @Override
    public void cellConfig() {
        System.out.println("2gb , Ios");
    }
}

class Samsung extends Phone{

    @Override
    public void cellConfig() {
        System.out.println("2gb , Android ");
    }
}
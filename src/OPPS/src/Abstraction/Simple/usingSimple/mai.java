package OPPS.src.Abstraction.Simple.usingSimple;

public class mai {
    public static void main(String[] args) {

        Iphone obj = new Iphone();
        samsung obj1 = new samsung();

        show(obj);
        show(obj1);

    }

    public static void show(Iphone obj)
    {
        obj.cellConfig();
    }

    public static void show(samsung obj1){
        obj1.cellConfig();
    }
}

class Iphone{

    public void cellConfig()
    {
        System.out.println("2gb , ios");
    }

}

class samsung{
    public void cellConfig(){
        System.out.println("2gb , Android ");
    }
}

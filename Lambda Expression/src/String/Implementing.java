package String;

@FunctionalInterface
interface FunctionalInterfaces{

    int SL(String s);
}


class SLC implements FunctionalInterfaces{


    @Override
    public int SL(String s) {

        return s.length();

    }
}

public class Implementing {


    public static void main(String[] args) {

        FunctionalInterfaces f = new SLC();
        System.out.println(f.SL("Satish"));

    }


}

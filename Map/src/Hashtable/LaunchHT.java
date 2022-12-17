package Hashtable;


import java.util.Hashtable;

class Ineuron{

    int i;

    public Ineuron(int i){
        this.i = i;
    }

}

public class LaunchHT {

    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();
        hashtable.put(new Ineuron(20) , "Ketan");


    }
}

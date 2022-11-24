package OPPS.src.Inheritance.Interface.Ineuron;

import java.io.Serializable;

/**
 The Interfaces do not contain any abstract methods those interfaces is called as Marker Interface.


 eg. Runnable , Serializable.

 */


public class MarkerInterfaces implements Runnable, Serializable {

    public static void main(String[] args) {
        MarkerInterfaces obj = new MarkerInterfaces();
        obj.run();
    }

    @Override
    public void run() {

    }
}

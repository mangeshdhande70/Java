package Synchronization.ObjectLevelSynchronization;


/**

 * Object level lock is achieved to restrict same object to operate through different thread,
   whereas class level lock is achieved to restrict any object to operate.



 */

class Object{

    synchronized void m1(String name)  {
        System.out.println("Welcome " +name );
        for (int i = 0; i < 5; i++) {
            System.out.println("m1 :: "+i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Intttttt");
            }
        }
        System.out.println("***** end of m1() method *******");
    }

}

class ParentOfObject extends Thread{

    Object object;
    String name;

    public ParentOfObject(Object object,String name){
        this.object = object;
        this.name = name;
    }

    @Override
    public void run() {
            object.m1(name);

    }
}

public class DiffObject {

    public static void main(String[] args) {

        Object object = new Object();

        ParentOfObject parent = new ParentOfObject(object,"Sachin1");
        ParentOfObject parent2 = new ParentOfObject(object , "Akash2");

        parent.start();
        parent2.start();

    }

}

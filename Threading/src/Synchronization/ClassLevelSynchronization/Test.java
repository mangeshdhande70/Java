package Synchronization.ClassLevelSynchronization;

/**

 if a method declared as synchronized and static then it ic called class level synchronization.


 * Object level lock is achieved to restrict same object to operate through different thread,
   whereas class level lock is achieved to restrict any object to operate.


 *  In class Level Lock only one thread and only one instance of class can access the method or
    block at a time. but in  Object level thread of different instances of class can access the method or
    block at a time.


 */

class Parent{


    synchronized static void m1(String name)
    {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread started Running");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }

    }
}

class MyThread extends Thread{

    String name;

    MyThread(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        Parent.m1(name);
    }
}


public class Test {

    public static void main(String[] args) {

        MyThread myThread = new MyThread("akash");
        myThread.start();


    }

}

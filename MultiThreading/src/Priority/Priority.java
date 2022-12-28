package Priority;

/**
 *

    we can't predict the Output


 * For every Thread in java has some priority.

 * valid range of priority is 1 to 10,it is not 0 to 10.
          if we try to give a different value it would result in
         "IllegalArgumentException".
         Thread.MIN_PRIORITY = 1
         Thread.MAX_PRIORITY = 10
         Thread.NORM_PRIORITY = 5

 * Thread class does not have priorities is Thread.LOW_PRIORITY,Thread.HIGH_PRIORITY.


 * Thread scheduler allocates cpu time based on "Priority.Priority".
    If both the threads have the same priority then which thread will get a chance as
    a pgm we can't predict because it is vendor dependent.

 * We can set and get priority values of the thread using the following methods
        a. public final void setPriority(int priorityNumber)
        b. public final int getPriority()

 * The allowed priorityNumber is from 1 to 10,if we try to give other values it would result in
    "IllegalArgumentException"

            eg.  System.out.println(Thread.currentThread().setPriority(100);//IllegalArgumentException.



 DefaultPriority
 ==============
 * The default priority for only main thread is "5", whereas for other threads priority will be inherited
  from parent to child.

 * Parent Thread priority will be given as Child Thread Priority.Priority.

 *
 */

class MyThread extends Thread{

    @Override
    public void run()
    {

        System.out.println("myThread Name ----- "+Thread.currentThread().getName());

        System.out.println("***** In Child ****** ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");
        }
    }
}
public class Priority {

    public static void main(String[] args) {

        Thread.currentThread().setPriority(10);

        System.out.print("Main Thread ----- "+Thread.currentThread().getName());
        System.out.println();


        MyThread myThread = new MyThread();
        myThread.setPriority(5);
        myThread.start();
        System.out.println("myThread Priority.Priority ----- "+myThread.getPriority());


        System.out.println("\n***** In Main ****** ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" ");

        }

    //    myThread.getPriority(11);  IllegalArgumentException"

    }
}

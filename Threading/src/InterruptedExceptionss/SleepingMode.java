package InterruptedExceptionss;

/**

   If Thread in sleeping or in waiting state then you can interrupt that Thread.


 */


class Interrupted extends Thread{

    @Override
    public void run()
    {
        try
        {
            for (int i = 0; i <5 ; i++) {
                System.out.println("I am sleeping Thread :: "+i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("I got Interrupted");
        }
    }

}

public class SleepingMode {

    public static void main(String[] args) {

        Interrupted interrupted = new Interrupted();
        interrupted.start();

        interrupted.interrupt();  // main Thread is waiting to execute child Thread and child thread is interrupted.

        System.out.println("In main Thread");


    }


}

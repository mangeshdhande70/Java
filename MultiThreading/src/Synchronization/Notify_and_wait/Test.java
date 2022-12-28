package Synchronization.Notify_and_wait;


class MyThread extends Thread {

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child Thread Started the Execution"); // executed 2nd
            for (int i = 0; i <=100 ; i++) {
                total+=i;
            }
            System.out.println("Child Thread giving Notification"); // executed 3rd
            this.notify();
        }
    }
}



public class Test {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        synchronized (myThread){  // Lock b Object

            System.out.println("Main Threading calling  wait() method"); // executed 1st
            myThread.wait();  // releasing lock
            System.out.println("main thread got Notification"); // executed 4th
            System.out.println("Total :: "+myThread.total);  // executed 5th

        }


    }
}

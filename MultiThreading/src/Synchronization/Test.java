package Synchronization;

/**

 if both locks are same type then output become regular otherwise irregular.



 */

class Methods{

   public static synchronized void displayNumbers()
    {

        try {
            for (int i = 1; i <= 10 ; i++) {
                System.out.print(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.print("Interrupted");
        }
    }

    public synchronized void displayCharacter(){
        try {
        for (int i = 65; i <= 75 ; i++) {
            System.out.print((char) i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException e)
        {
            System.out.print("Interrupted");
        }
    }
}

class MyThread1 extends Thread{

    Methods methods;

    public MyThread1(Methods methods)
    {
        this.methods = methods;
    }

    @Override
    public void run() {
        methods.displayCharacter();
    }
}


class MyThread2 extends Thread{

    Methods methods;

    public MyThread2(Methods methods)
    {
        this.methods = methods;
    }

    @Override
    public void run() {
        methods.displayNumbers();
    }
}

public class Test {
    public static void main(String[] args) {

        Methods methods = new Methods();

        MyThread1 myThread1 = new MyThread1(methods);
        MyThread2 myThread2 = new MyThread2(methods);


        myThread1.start();
        myThread2.start();



    }
}

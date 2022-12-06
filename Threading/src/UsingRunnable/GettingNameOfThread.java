package UsingRunnable;



class MyThread implements Runnable{


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }
}


public class GettingNameOfThread {

    public static void main(String[] args) {

        Thread thread = new Thread();

        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());

        MyThread myThread = new MyThread();


    }
}

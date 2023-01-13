package Synchronization.BlockLevelLock;


class Display{

    public void wish(String name){


//        System.out.println(Thread.currentThread().getName());
        synchronized (this){
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 5; i++) {
                System.out.print("Good Morning :: ");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(name);
                System.out.println();
            }
        }

    }

}


class MyThread implements Runnable{

    Display display;
    String name;

    MyThread(Display display , String name) {
        this.name = name;
        this.display = display;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}
public class LaunchFirst  {


    public static void main(String[] args) {

        Display display = new Display();
//        Thread myThread1 = new MyThread(display,"Yuvi");
//        Thread myThread2 = new MyThread(display,"Dhoni");

//        myThread1.start();
//        myThread2.start();



        Runnable r1 = new MyThread(display,"Yuvi");
        Runnable r2 = new MyThread(display,"Dhoni");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.setName("Yuvi");
        t2.setName("Dhoni");

    }
}

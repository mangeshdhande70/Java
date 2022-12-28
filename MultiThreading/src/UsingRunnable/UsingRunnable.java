package UsingRunnable;


/**

 Good Approach bcz of we can inherit the another class...here we're implementing interface, so we can inherit.

 */


class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 5  ; i++) {
            System.out.println("Child Thread");
        }

    }
}

public class UsingRunnable {

    public static void main(String[] args) {


        MyRunnable myRunnable = new MyRunnable();
//        myRunnable.start();   not available only in implementation

        Thread t = new Thread();
        t.start();         // calling run() of Thread class (No implementation)


        Thread thread = new Thread(myRunnable);
        thread.start();


        for (int i = 0; i <  5; i++)
            System.out.println("Main");


    }

}

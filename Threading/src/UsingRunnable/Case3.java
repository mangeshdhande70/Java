package UsingRunnable;



class MyRunnable3 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
        System.out.println();
        System.out.println("End Child Class Thread\n\n");


    }
}


public class Case3 {

    public static void main(String[] args) {


        MyRunnable3 myRunnable = new MyRunnable3();
//        myRunnable.start();   not available only in implementation

        Thread t1 = new Thread();
        t1.start();// calling run() of Thread class (No implementation)  (New Thread will created)
        t1.run();  // Nothing printed ...calling run method of Thread class

//        myRunnable.start();  CE
        myRunnable.run(); // new thread won't create but run method of MyRunnable class is executed just like normal method

        System.out.println("After t1.run() ");

        Thread t2 = new Thread(myRunnable);
        t2.run();   // Not created New Thread here just normally calling the run method of MyRunnable3 class


        Thread t3 = new Thread(myRunnable);
        System.out.println("Using Thread");
        t3.start();  // Now created New Thread and calling run method of MyRunnable3 using thread.



        System.out.println("//////");


        for (int i = 0; i <  5; i++)
            System.out.println("Main");


    }

}

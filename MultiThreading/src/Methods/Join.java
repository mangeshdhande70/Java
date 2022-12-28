package Methods;

/**

 * If the thread has to wait until the other thread finishes its execution then we need to go for join().

 * if t1 executes t2.join() then t1 should wait till t2 finishes its execution.

 * t1 will be entered into waiting state until t2 completes, once t2 completes then t1 can continue
    with its execution.

 eg#1.
 venue fixing =====> t1.start()
 wedding card printing =====> t2.start()=====> t1.join()
 wedding card distribution =====> t3.start()=====> t2.join()



 Prototype of join()
 ===================
 public final void join() throws InterruptedException
 public final void join(long ms)throws InterruptedException
 public final void join(long ms,int ns)throws InterruptedException



 Note:

      While one thread is in waiting state and if one more thread interrupts then it would result in
      "InterruptedException".InterruptedException is checkedException which should always be handled.


  Thread t =new Thread();//new/born state

  t.start();//ready/runnable state

 -> If T.S allocates cpu time then Thread enters into running state

 -> If currently executing Thread invokes t.join()/t.join(1000),t.join(1000,100),
    then it would enter into waiting state.

 -> If the thread finishes the execution/time expires/interupted then it would come
    back to ready state/runnable state.

 -> If run() is completed then it would enter into dead state.



 *
 */




class MyThread3 extends Thread{

    @Override
    public void run()
    {
        System.out.println("Child Thread");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

}

public class Join {

    public static void main(String[] args) throws InterruptedException {

        MyThread3 myThread3 = new MyThread3();
        myThread3.start();


        myThread3.join();
        System.out.println("Main Thread");

    }
}

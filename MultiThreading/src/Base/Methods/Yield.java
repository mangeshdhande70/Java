package Base.Methods;

/**


 * yield() => It causes to pause current executing Thread for giving chance for waiting Threads of
              same priority.

 * If there is no waiting Threads or all waiting Threads have low priority then
   same Thread can continue its execution.

 * If all the threads have same priority and if they are waiting then which thread will get chance we can't
   expect, it depends on ThreadScheduler.

 * The Thread which is yielded, when it will get the chance once again depends on the
   mercy on "ThreadScheduler" and we can't expect exactly.



      ----  public static native void yield()


 class MyThread extends Thread{
@Override
public void run(){
for (int i=1;i<=5 ;i++ ){
System.out.println("child thread");
Thread.yield();//line-1
}
}
}
 public class TestApp{
 public static void main(String... args){
 MyThread t= new MyThread();
 t.start();
 for (int i=1;i<=5 ;i++ ){
 System.out.println("Parent Thread");
 }
 }
 }




 Note::
 If we comment line-1, then we can't expect the output becoz both the threads have same priority then which
 thread the ThreadScheduler will schedule is not in the hands of programmer but if
 we don't comment line-1,
 then there is a possibility of main thread getting more no of times, so main thread
 execution is faster than
 child thread will get chance.
 Note: Some platforms wont provide proper support for yield(),becuase it is getting
 the execution
 code from other language prefereably from 'C'.



 */


class MyTreader extends Thread{


    @Override
    public void run()
    {
        System.out.println("Child Priority --- "+Thread.currentThread().getPriority());
        System.out.println("Child Thread ");
        Thread.yield();
    }
}

public class Yield {

    public static void main(String[] args) {


        MyTreader myTreader = new MyTreader();
        myTreader.setPriority(2);
        myTreader.start();

        System.out.println("Main Priority --- "+Thread.currentThread().getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

//        System.out.println("\n\n");
//        for (int i = 1; i <= 10 ; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.println(i*j);
//            }
//            System.out.println("         ");
//
//        }



    }
}

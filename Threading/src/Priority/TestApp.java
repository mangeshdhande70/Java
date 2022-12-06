package Priority;

/**

 * Since priority of child thread is more than main thread, jvm will execute child thread first
   whereas for the parent thread priority is 5 so, it will get last chance.

 if we comment line-1, then we can't predict the order of execution becoz both the threads have same priority.
 Some platform won't provide proper support for Thread priorities.
 eg:: windows7,windows10,...


 */


class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5 ;i++ ){
            System.out.println("child thread");
        }
    }
}


public class TestApp{


    public static void main(String... args){


        Thread.currentThread().setPriority(10);

        MyThread1 t= new MyThread1();
        t.setPriority(2);//line -1
        t.start();


        for (int i=1; i<=5; i++){
            System.out.println("main thread");
        }
    }
}

package Base.UsingRunnable;


/**

   * Inside the Runnable only run method is existed, and it is a Functional Interface.

         interface Runnable{
                   public abstract void run();
            }

   * It is a Good Approach bcz when u extending Thread class u cannot extend other class if u need bcz at a time
     class can extend only one class hence, implementing Runnable is a good approach while creating new Thread.

 */
class MyRunnable1 implements Runnable{

    @Override
    public void run() {

        System.out.println("Inside MyRunnable run method");

    }
}
public class Base {


    public static void main(String[] args) {


        MyRunnable1 myRunnable1 = new MyRunnable1();

        myRunnable1.run(); // here u directly calling run method , not new Thread created and u can't call start directly



        /*
           * How to call start method ?
         */
        Thread thread = new Thread(myRunnable1);

        thread.start();








    }



}

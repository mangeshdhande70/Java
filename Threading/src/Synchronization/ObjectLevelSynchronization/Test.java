package Synchronization.ObjectLevelSynchronization;

/**

 synchronization
 ===============
 1. synchronized is a keyword applicable only for methods and blocks.

 2. if we declare a method/block as synchronized then at a time only one thread can execute that
    method/block on that object.

 3. The main advantage of synchronized keyword is we can resolve data inconsistency problems.

 4. But the main disadvantage of synchronized keyword is it increases waiting time of the Thread
    and effects performance of the system.

 5. Hence, if there is no specific requirement then never recommended to use synchronized keyword.

 6. Internally synchronization concept is implemented by using lock concept.

        class X{
             synchronized void m1(){}
             synchronized void m2(){}
             void m3(){}
         }

 7. this is also called as Object Level Synchronization.


 */


class Display {

    public synchronized void wish(String name)
    {
        for (int i = 0; i < 5; i++) {

            System.out.println("Good Evening :: "+name);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                new InterruptedException();
            }

        }
    }
}
class MyThread extends Thread{

    Display d;
    String name;

    public MyThread(Display d,String name){
        this.d = d;  // ----> Object Passing
        this.name = name;

    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class Test {

    public static void main(String[] args) {

        Display display = new Display();
        MyThread myThread1 =  new MyThread(display,"sachin");
        myThread1.start();

        MyThread myThread2 =  new MyThread(display,"Akash");
        myThread2.start();

    }
}

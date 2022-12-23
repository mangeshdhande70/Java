package MethodReference;


public class LaunchFirst {


    public static void m1()
    {
        for (int i = 0; i <= 10; i++) {

            System.out.println("Child Thread");
        }

//        return null;
    }

    public static void main(String[] args) throws InterruptedException {


        // Using method reference binded the method call of run() of interface Runnable.
        Runnable runnable = LaunchFirst::m1;


        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("main Thread");
            Thread.sleep(1000);

        }

    }


}

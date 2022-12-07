package UsingLambdaAndAnonymousClass;

// Only one .class file

public class UsingLambdaTest_1 {

    public static void main(String[] args) throws InterruptedException {


        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("child Thread :: "+i);
            }
            try {
                Thread.sleep(2000);
                System.out.println("hello guys");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable);
    //  thread.setPriority(11);   ----> IllegalArgumentException  setPriority range 1 to 10
        thread.start();
        //   thread.start();  ----> IllegalThreadStateException

        thread.join(1000);

        for (int i = 0; i < 5; i++) {

           //  thread.start();  ----> IllegalThreadStateException
            System.out.println("Main Thread :: "+i);
        }
    }


}

package UsingLambdaAndAnonymousClass;

// Two .class files


public class UsingAnonnymous {


    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child Thread :: "+i);
                }
                try {
                    System.out.println("Before Sleeping");
                    Thread.sleep(2000);
                    System.out.println("After Sleeping");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        thread.join(3000);

        for (int i = 0; i < 5; i++) {
            System.out.println("main thread :: "+i);
        }

    }


}

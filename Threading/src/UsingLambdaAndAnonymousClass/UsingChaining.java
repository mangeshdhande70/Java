package UsingLambdaAndAnonymousClass;

public class UsingChaining {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child thread :: "+i);
                }
            }
        }).start();


        int i=0;
        for (; i <5;) {
            System.out.println("Main thread ::"+i);
            i++;

        }



    }



}

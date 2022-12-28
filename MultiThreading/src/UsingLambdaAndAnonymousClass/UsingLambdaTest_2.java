package UsingLambdaAndAnonymousClass;

public class UsingLambdaTest_2 {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("child Thread :: "+i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread :: "+i);
        }
    }

}

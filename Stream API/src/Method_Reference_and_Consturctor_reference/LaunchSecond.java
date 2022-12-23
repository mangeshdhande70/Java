package Method_Reference_and_Consturctor_reference;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;

public class LaunchSecond {


    public static void main(String[] args) {

        Runnable runnable = () ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


        for (int i = 0; i < 5 ; i++) {

            System.out.println("Main Thread");

        }


    }


}

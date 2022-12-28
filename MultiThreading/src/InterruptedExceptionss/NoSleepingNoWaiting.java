package InterruptedExceptionss;


class Threader extends  Thread{

    @Override
    public void run()
    {
            for (int i = 0; i < 5; i++) {
                System.out.println("Not sleeping child Thread :: " + i);
            }
    }

}


public class NoSleepingNoWaiting {

    public static void main(String[] args) throws InterruptedException{

        Threader threader = new Threader();
        threader.start();

        threader.interrupt(); // not affected ....Interruption not happened

        System.out.println("end of Main Thread");

    }
}

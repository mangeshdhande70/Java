package Methods;



class MyThread extends Thread{

    @Override
    public void run() {
        super.run();

        try{

            System.out.println("Inside Child Thread");
            Thread.sleep(2000);
            System.out.println();
            System.out.println("Hey baby");
            System.out.println("I missing u");
            Thread.sleep(3000);
            System.out.println("please come na");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class JoinWithPara {


    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join(1000);


        System.out.println("Inside main Thread");
        for (int i = 0; i < 5; i++) {

            System.out.print(i+" ");

        }

//        myThread.start();  IllegalThreadStateException
        myThread.join(3000,100);  // 3000(milli Seconds) + 100(non Seconds)
        System.out.println("I'm coming baby from main Thread");



    }
}

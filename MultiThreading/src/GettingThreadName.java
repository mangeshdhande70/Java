

class Child extends Thread{

    @Override
    public void run()
    {
        System.out.println("Child Thread");
        System.out.println("In child ..Thread name - "+Thread.currentThread().getName());

    }

}

public class GettingThreadName {

    public static void main(String[] args) {

        System.out.println("Main Thread before - "+Thread.currentThread().getName());

        Child c = new Child();
        c.start();

        System.out.println("Thread Name of c instance - "+c.getName());

        System.out.println("Thread after creating Thread - "+ Thread.currentThread().getName());

    }

}


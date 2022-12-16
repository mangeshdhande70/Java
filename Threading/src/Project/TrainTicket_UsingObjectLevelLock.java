package Project;

import java.util.Scanner;

class Ticket{


    Scanner scanner = new Scanner(System.in);
    static int i = 12345;
    static int count = 1;

    public void searchTicket(String name) {
        synchronized (this) {
            System.out.print("From Where :: ");
            String cityName = scanner.nextLine();
            System.out.print("to :: ");
            String destinationCity = scanner.nextLine();
            String trainName;


            if (cityName.equalsIgnoreCase("Nagpur") &&
                    destinationCity.equalsIgnoreCase("Chandrapur")) {
                trainName = "Tamil Nadu - 9999";
                System.out.print("Tamil nadu Express at 2pm");
            } else {
                trainName = "Passenger -  0000";
                System.out.print("Passenger at 6.00pm");
            }

            System.out.println("\n1 Book");
            System.out.println("2 Cancel");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                bookTicket();
                    synchronized (this) {
                        bookTicket(trainName, name, cityName, destinationCity);
                    }
                    break;

                case 2:
                    break;
                default:
                    System.out.println("wrong time");
            }
        }
    }

    public  void bookTicket(String trainName,String name,String from , String to)
    {

        System.out.println("ticket booked successfully");
        System.out.println("Name :--> "+name+"\nProject.Ticket No :--> " + (i++)+"\nTrain Name :--> "+trainName);
        System.out.println("From --> "+from+"  to --> "+to);
        System.out.println("______________________________________________________________________________");
//        synchronized (this) {
//            System.out.println("Project.Ticket No. -- " + (i++));
//        }

    }

}


class MyThread extends Thread{

    Ticket ticket;
    String name;

    public MyThread(Ticket ticket, String name){
        this.ticket = ticket;
        this.name = name;
    }

    @Override
    public void run() {
        ticket.searchTicket(name);
    }
}

public class TrainTicket_UsingObjectLevelLock {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket();

        Ticket ticket2 = new Ticket();

        MyThread myThread1 =  new MyThread(ticket1,"Ankit");

        MyThread myThread2 = new MyThread(ticket2,"Rakesh");

        myThread1.start();
        myThread2.start();



    }
}

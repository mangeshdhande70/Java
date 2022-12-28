package CustomException;


import java.util.Scanner;

class UnderAgeException extends Exception{

    public UnderAgeException(String str)
    {
        super(str);
    }

}

class OverAgedException extends Exception{


}

class ElectionCriteria {

    String name;
    int age;
    Scanner scanner = new Scanner(System.in);

    void input() {
        System.out.println("Enter Your Name: ");
        name = scanner.next();
        System.out.println("Enter Your Age: ");
        age = scanner.nextInt();
    }

    void infoChecker() throws Exception {
        if (age < 18) {
            UnderAgeException o = new UnderAgeException("Bsdk Phle age dekh le....hahaha");
            System.out.println(o.getMessage());
            System.out.println(o.getClass());
            throw o;
        } else if (age > 60) {
            OverAgedException o = new OverAgedException();
            System.out.println("Bhaiya ji ...Jyada uchlo mt.....");
            System.out.println(o.getClass());
            throw o;
        } else System.out.println("Your Eligible");
    }


}

class Election{

    void infoChecker()
    {
        ElectionCriteria e = new ElectionCriteria();

        try {
            e.input();
            e.infoChecker();
        }
        catch (Exception exception)
        {
            try {
                e.input();
                e.infoChecker();
            }
            catch (Exception except)
            {
                System.out.println("Hogya ab Nikal");
            }
        }

    }

}
public class LaunchSecond {

    public static void main(String[] args) {

        Election election = new Election();
        election.infoChecker();

    }


}

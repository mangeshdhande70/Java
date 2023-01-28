package DateAndTIme;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UsingSimpleDateFormat {


    public static void main(String[] args) throws ParseException {


        System.out.println("Enter DOB in (dd-MM-yyyy) Format");
        Scanner scanner = new Scanner(System.in);

        String uDate = scanner.next();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = simpleDateFormat.parse(uDate);

        long value = date.getTime();

        java.sql.Date date1 = new java.sql.Date(value);


        System.out.println("*********** Date **************");
        System.out.println("User Input Date :: "+uDate);
        System.out.println("Java Date :: "+date);
        System.out.println("Sql Date :: "+date1);



        // if user enter in yyyy-MM-dd format then no need to convert we can directly convert into sql

        System.out.println("Enter DOB in (yyyy-MM-dd) Format");
        String inputDate = scanner.next();
        java.sql.Date date2 = java.sql.Date.valueOf(inputDate);
        System.out.println("Direct conversion Date ::  "+date2);




    }


}

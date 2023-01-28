package DateAndTIme;

import java.util.Date;

public class LaunchFirst {

    public static void main(String[] args) {


        // we use to store data and time
        Date date = new Date();
        System.out.println("Java util Date :: "+date);


        long value = date.getTime();



        // we use to store only Dat
        java.sql.Date date1 = new java.sql.Date(value);
        System.out.println("Sql date :: "+date1);


    }

}

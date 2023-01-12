package Basics2.DynamicIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchFirst {
    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;

        String url = "jdbc:mysql:///ineuron";
        String user = "root";
        String pass = "Md7$#1998";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        String name = input.next();

        System.out.println("Enter Student Last Name : ");
        String lastName = input.next();

        System.out.println("Enter Student Mail Id : ");
        String mailId = input.next();

        System.out.println("Enter Student Mobile No : ");
        int mobNo = input.nextInt();


        System.out.println("Enter Student Age : ");
        int age = input.nextInt();

        System.out.println("Enter Student course : ");
        int course = input.nextInt();


        try {

            connection = DriverManager.getConnection(url, user, pass);

            statement = connection.createStatement();

            String sqlQuery = String.format("INSERT INTO student(`name`,`lastName`,`mailId`,`mobNo`,`age`,`course`)Values('%s','%s','%s',%d,%d,%d)",
                    name,lastName,mailId,mobNo,age,course);



            int rowAffected = statement.executeUpdate(sqlQuery);
            System.out.println("No of rows affected is :: " + rowAffected);

            // Step6. Close the resources
            statement.close();
            connection.close();
            input.close();
            System.out.println("closing the resources...");



        }catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
}

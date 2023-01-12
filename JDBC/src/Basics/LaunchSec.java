package Basics1;

import java.sql.*;

public class LaunchSec {


    public static void main(String[] args) {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {

            //Step1. Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver loaded successfully....");


            //Step2 : Established connection

            String url = "jdbc:mysql://localhost:3306/ineuron";

            String user = "root";
            String pass = "Md7$#1998";

            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("The Implementation class name :: "+connection.getClass().getName());


            //Step3:
            statement =connection.createStatement();


            resultSet = statement.executeQuery("select * from courses");


            System.out.println("\n");
            System.out.println("Course Id\t\tCourse Name");
            System.out.println("___________________________________________________");

            while (resultSet.next())
            {

                Integer id = resultSet.getInt(1);
                String courseName = resultSet.getString(2);

                System.out.println("\t"+id+"\t\t\t"+courseName);

            }


        }
        catch (ClassNotFoundException cn)
        {
            cn.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}

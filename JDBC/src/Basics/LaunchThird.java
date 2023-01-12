package Basics1;

import java.sql.*;

public class LaunchThird {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try{

            //Step1. Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully....");


            String url = "jdbc:mysql://localhost:3306/ineuron";

            String user = "root";
            String pass = "Md7$#1998";


            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("The Implementation class Name:: "+connection.getClass().getName());



            statement = connection.createStatement();
            System.out.println("The Implementation class Name:: "+statement.getClass().getName());


            resultSet = statement.executeQuery("SELECT * FROM courses");
            System.out.println("The Implementation class Name:: "+resultSet.getClass().getName());


            System.out.println("\n");
            System.out.println("Course ID\t\t Courses Name");
            System.out.println("______________________________________________");

            while (resultSet.next())
            {
                Integer id = resultSet.getInt(1);
                String cName = resultSet.getString(2);

                System.out.println("\t"+id+"\t\t\t   "+cName);
            }


        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}

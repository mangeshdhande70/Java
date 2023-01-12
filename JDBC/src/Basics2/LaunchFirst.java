package Basics2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LaunchFirst {


    public static void main(String[] args) {



        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            //Step1. Load and register the Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded successfully....");

            //Step2. Establish the Connection with database
            String url = "jdbc:mysql:///ineuron";

            //username and password would vary from user to user
            String user = "root";
            String pass = "Md7$#1998";



            connection = DriverManager.getConnection(url,user,pass);
            System.out.println("Connection Established.....");
            System.out.println("The implementation class Name is ::  "+connection.getClass().getName());


            //Step3. Create statement Object and send the query

            String sqlQuery = "select id,name,lastName,mailId,mobNo,salary,age,course from student";

            statement = connection.createStatement();
            System.out.println("The implementation class Name is :: "+statement.getClass().getName());

            resultSet =statement.executeQuery(sqlQuery);


            System.out.println("\n\n");
            System.out.println("Id\t\t\t\tName\t\t\t\tLastName\t\t\t\tMailId\t\t\t\tMobNo\t\t\t\tSalary" +
                    "\t\t\t\tAge\t\t\t\tCourse");

            System.out.println("___________________________________________________________________________________________________________________");
            while (resultSet.next())
            {

                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String mailId = resultSet.getString(4);
                Integer mobNo = resultSet.getInt(5);
                Integer salary = resultSet.getInt(6);
                Integer age = resultSet.getInt(7);
                Integer course = resultSet.getInt(8);

                System.out.println(id+"\t\t\t\t"+name+"\t\t\t\t"+lastName+"\t\t\t\t"
                        +mailId+"\t\t\t"+mobNo+"\t\t\t\t"+salary+ "\t\t\t\t"+age+"\t\t\t\t"+course);


            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}

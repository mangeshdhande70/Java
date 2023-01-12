package Basics2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchUpdate {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;

        String url = "jdbc:mysql:///ineuron";

        String user = "root";
        String pass = "Md7$#1998";

        try{

            connection = DriverManager.getConnection(url,user,pass);

            statement = connection.createStatement();


//            int r = statement.executeUpdate("UPDATE student set lastName='Kakade' where id=25");
            int r = statement.executeUpdate("UPDATE student set lastName='Kukude' where id=23");


            System.out.println("No of Rows affected is :: "+r);




        }catch (SQLException s){
            s.printStackTrace();
        }


        statement.close();
        connection.close();
        System.out.println("CLosing Resources");



    }

}

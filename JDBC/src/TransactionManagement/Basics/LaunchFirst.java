package TransactionManagement.Basics;

import MyCode.JdbcUtil;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        String sql = "SELECT * FROM ineuron.trans";

        try{


            connection = JdbcUtil.getJDBCConnection();

            statement = connection.createStatement();

            ResultSet resultSet =  statement.executeQuery(sql);

            System.out.println("Before Transaction");
            System.out.println("\tName\tAmount");

            if (resultSet!=null) {
                while (resultSet.next()) {
                    System.out.println("\t" + resultSet.getString(1) + "\t" + resultSet.getInt(2));
                }
            }


            System.out.println("Transaction Started");
            connection.setAutoCommit(false);


            statement.executeUpdate("UPDATE trans SET amount=amount-5000 where name='Mangesh'");
            statement.executeUpdate("UPDATE trans SET amount=amount+5000 where name='Rakesh'");

            System.out.println("Confirm :: [YES/NO]");
            Scanner scanner = new Scanner(System.in);
            String r = scanner.next();

            if (r.equalsIgnoreCase("yes"))
            {
                connection.commit();
            }
            else
                connection.rollback();


            System.out.println("After Transaction");

            ResultSet resultSet1 =  statement.executeQuery(sql);

            if (resultSet1!=null) {
                while (resultSet1.next()) {
                    System.out.println("\t" + resultSet1.getString(1) + "\t" + resultSet1.getInt(2));
                }
            }



        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }





}

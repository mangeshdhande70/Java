package TransactionManagement.Basics;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class LaunchSec {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try{

            connection = JdbcUtil.getJDBCConnection();

            if (connection!=null)
                statement = connection.createStatement();

            if (statement!=null){
                statement.executeUpdate("insert into politician(`name`,`party`) Values ('modi','BJP')");
                statement.executeUpdate("insert into politician(`name`,`party`) Values ('kejeriwal','AAM')");

                Savepoint savepoint = connection.setSavepoint();

                statement.executeUpdate("insert into politician(`name`,`party`) Values ('ketan','AAM')");

            }

            assert connection != null;
            connection.commit();


        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }



}

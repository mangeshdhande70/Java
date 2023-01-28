package BLOB;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


/**
 * @author mangesh.dhande
 * @Company MBD@AI.ai
 * @see
 */

public class JdbcUtilBLOB {


    // create private Constructor to restrict to instantiate object of the class
    private JdbcUtilBLOB() {}

    public static Connection getJDBCConnection() throws IOException, SQLException {

        Connection connection = null;


        FileInputStream fileInputStream = new FileInputStream("C://Users//mangesh.dhande//IdeaProjects//Java//JDBC//src//BLOB//application.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);


        connection = DriverManager.getConnection(properties.getProperty("url"),
                    properties.getProperty("user"), properties.getProperty("password"));

        return connection;
    }




    public static void cleanUp(Connection connection , Statement statement , ResultSet resultSet) throws SQLException {


        if (resultSet!=null)
            resultSet.close();

        if (statement!=null)
            statement.close();

        if (connection!=null)
            connection.close();


    }
}

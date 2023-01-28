package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcConnection {


    private JdbcConnection(){}

    public static  Connection getJdbcConnection() throws RuntimeException {


        Connection connection = null;
        Properties properties = null;

        try{

            File file = new File("C://Users//mangesh.dhande//IdeaProjects//Java//JdbcS//src//connection//application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);

            properties = new Properties();
            properties.load(fileInputStream);

            connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),
                                                       properties.getProperty("password"));


            return connection;

        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public static  void cleanUpResources(Connection connection , Statement statement , ResultSet resultSet) throws SQLException {

        if (resultSet!=null)
            resultSet.close();

        if (statement!=null)
            statement.close();

        if (connection!=null)
            connection.close();
    }



}

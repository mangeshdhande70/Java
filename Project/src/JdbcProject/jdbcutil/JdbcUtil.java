package JdbcProject.jdbcutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public abstract class JdbcUtil {

    static Connection connection = null;

    public static Connection getJdbcConnection() throws IOException, SQLException {




//        connection = DriverManager.getConnection();

        FileInputStream fileInputStream =new FileInputStream("C://Users//mangesh.dhande//IdeaProjects//Java" +
                "//Project//src//JdbcProject//jdbcutil//application.properties");


        Properties properties = new Properties();
        properties.load(fileInputStream);

//       System.out.println(properties.getProperty("url"));
//       System.out.println(properties.getProperty("user"));
//       System.out.println(properties.getProperty("password"));

        connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),
                properties.getProperty("password"));


        return connection;

    }


    public static void clearUpResources(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {


        if (resultSet!=null)
            resultSet.close();

        if (statement!=null)
            statement.close();

        if (connection!=null)
            connection.close();


    }





}

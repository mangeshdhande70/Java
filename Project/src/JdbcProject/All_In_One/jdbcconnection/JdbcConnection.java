package JdbcProject.All_In_One.jdbcconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public abstract class JdbcConnection {

    public static Connection jdbcConnection() {

        Connection connection = null;

            try {
                FileInputStream fis = new FileInputStream("C://Users//mangesh.dhande//IdeaProjects//Java" +
                        "//Project//src//JdbcProject//All_In_One//jdbcconnection//application.properties");

                Properties properties = new Properties();
                properties.load(fis);

                connection = DriverManager.getConnection(properties.getProperty("url"),
                        properties.getProperty("user"),
                        properties.getProperty("password"));
            } catch (IOException | SQLException e) {
                throw new RuntimeException(e);
            }

            return connection;
        }

        public static  void cleaUpResources(Connection connection , Statement statement , ResultSet resultSet){

        try {
            if (resultSet!=null)
                resultSet.close();

            if (statement!=null)
                statement.close();

            if (connection!=null)
                connection.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}

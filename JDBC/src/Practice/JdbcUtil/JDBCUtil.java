package Practice.JdbcUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public abstract class JDBCUtil {


    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class Load and Register");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


     static  Connection connection= null;


    public static Connection getConnection() throws IOException, SQLException {

        FileInputStream fileInputStream = new FileInputStream("C://Users//mangesh.dhande//IdeaProjects//Java//JDBC//src//Practice//JdbcUtil//application.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);


         String url = properties.getProperty("url");
         String user = properties.getProperty("user");
         String password = properties.getProperty("password");

            System.out.println("url = "+url);
            System.out.println("user = "+user);
            System.out.println("password = "+password);

        connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),
                                    properties.getProperty("password"));


        return connection;


    }


    public static  void closeResources(Connection connection , Statement statement, ResultSet resultSet) throws SQLException {

        if(resultSet!=null)
            resultSet.close();

        if(statement!=null)
            statement.close();

        if(connection!=null)
            connection.close();



    }


}

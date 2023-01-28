package ConnectionPool.Basic;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstApp {

    public static void main(String[] args) throws SQLException {

        // Create an object of a class which implements javax.sql.DataSource
        MysqlConnectionPoolDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setURL("jdbc:mysql:///college");
        dataSource.setUser("root");
        dataSource.setPassword("Md7$#1998");


        // Getting the connection object from connection pool
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
        ResultSet resultSet = preparedStatement.executeQuery();

        System.out.println("Id\tStudent Name\t\tAGE\t\tAddress");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t   "+resultSet.getString(2)+"\t\t\t"+
                        resultSet.getInt(3)+"\t\t"+resultSet.getString(4));
            }

        // sending the connection object back to connection pool
        connection.close();



    }

}

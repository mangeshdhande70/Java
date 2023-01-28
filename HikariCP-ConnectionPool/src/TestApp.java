import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApp {


    public static void main(String[] args) throws SQLException {

        String configFile = "C:\\Users\\mangesh.dhande\\IdeaProjects\\Java\\HikariCP-ConnectionPool\\src\\application.properties";

        HikariConfig config = new HikariConfig(configFile);
        try(HikariDataSource dataSource = new HikariDataSource(config);) {

            Connection connection = dataSource.getConnection();

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            System.out.println("Id\tStudent Name\t\tAGE\t\tAddress");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t   " + resultSet.getString(2) + "\t\t\t" +
                        resultSet.getInt(3) + "\t\t" + resultSet.getString(4));
            }

            dataSource.close();

        }
    }

}

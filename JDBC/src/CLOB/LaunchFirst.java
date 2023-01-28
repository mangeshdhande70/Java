package CLOB;
import BLOB.JdbcUtilBLOB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        String sql = "INSERT INTO person(`name`,`image`,`resume`) VALUES(?,?,?)";

        try {
            connection = JdbcUtilBLOB.getJDBCConnection();

            preparedStatement = connection.prepareStatement(sql);

            scanner = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = scanner.next();

            System.out.println("Enter your file path");
            String path = scanner.next();

            System.out.println("Enter Resume file path");
            String resumePath = scanner.next();

//            resumePath1

            preparedStatement.setString(1,name);

            preparedStatement.setBinaryStream(2,new FileInputStream(new File(path)));

            preparedStatement.setCharacterStream(3,new FileReader(new File(resumePath)));

            int rowAffected = preparedStatement.executeUpdate();

            System.out.println("DONE........RowAffected :: "+rowAffected);



        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtilBLOB.cleanUp(connection,preparedStatement,null);
        }


    }





}

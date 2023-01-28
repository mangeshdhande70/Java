package CLOB;

import BLOB.JdbcUtilBLOB;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Retrieval {


    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        ResultSet resultSet = null;

        String sql = "SELECT `resume` FROM person where id = ? ";

        try {
            connection = JdbcUtilBLOB.getJDBCConnection();

            preparedStatement = connection.prepareStatement(sql);

            scanner = new Scanner(System.in);

            System.out.println("Enter your id");
            int id = scanner.nextInt();


            preparedStatement.setInt(1, id);



           resultSet =  preparedStatement.executeQuery();

            if (resultSet.next()) {
                Reader reader = resultSet.getCharacterStream("resume");

                File file = new File("rk.txt");

                FileWriter fileWriter = new FileWriter(file);

                IOUtils.copy(reader, fileWriter);

                fileWriter.close();
                System.out.println(file.getAbsolutePath());
            }else {
                System.out.println("Record not found");
            }


        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

}
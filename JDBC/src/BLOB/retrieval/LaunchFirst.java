package BLOB.retrieval;

import BLOB.JdbcUtilBLOB;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);
        ResultSet resultSet = null;
        String sqlQuery = "SELECT id,name,image FROM person where id = ?";

        try{

           connection = JdbcUtilBLOB.getJDBCConnection();

           preparedStatement = connection.prepareStatement(sqlQuery);

           System.out.println("Enter the Id");
           int id = scanner.nextInt();

           preparedStatement.setInt(1,id);

           resultSet = preparedStatement.executeQuery();

           if(resultSet.next()) {
               System.out.println("ID\tName\tImage");

               int id1 = resultSet.getInt(1);
               String name = resultSet.getString(2);

               InputStream is = resultSet.getBinaryStream(3);

               File file = new File("image.jpg");
               FileOutputStream fileOutputStream = new FileOutputStream(file);
//           Byte[] b = new Byte[1024];
//           if(is.read(b) > 0){
//               fileOutputStream.write(b);
//           }

               IOUtils.copy(is, fileOutputStream);

               fileOutputStream.close();
               System.out.println(id + " \t " + name + " \t " + file.getAbsolutePath());
//            System.out.println(id + "\t" + name + "\t" + file.getAbsolutePath());
           }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }







}

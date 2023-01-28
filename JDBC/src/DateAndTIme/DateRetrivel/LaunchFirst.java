package DateAndTIme.DateRetrivel;

import MyCode.JdbcUtil;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) throws SQLException {


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Scanner scanner = null;
        String sqlQuery = "select id,name,mailId,course,dob,doj from student where id=?";

        try{
            // connection Established
            connection = JdbcUtil.getJDBCConnection();

            if(connection!=null)
                    preparedStatement = connection.prepareStatement(sqlQuery);


            scanner = new Scanner(System.in);


            System.out.println("Enter Student Id to get data");

            assert preparedStatement != null;
            int id =scanner.nextInt();

            // setting input value
            preparedStatement.setInt(1,id);

            // executing query
            resultSet = preparedStatement.executeQuery();


            if (resultSet!=null && resultSet.next())
            {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String dob = simpleDateFormat.format(resultSet.getDate("dob"));
                String doj = simpleDateFormat.format(resultSet.getDate("doj"));


                System.out.printf("%2s%10s%20s%18s%12s%15s" , "Id","Name","Mail Id","course","DOB","DOJ");
                System.out.println();
                System.out.printf("%2s%10s%25s%10s%19s%15s" ,
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("mailId"),
                                resultSet.getInt("course"),
                                dob,
                                doj);
            }
            else
               System.out.println("Record not available for given id ::"+id);

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.cleanUp(connection,preparedStatement,resultSet);
        }


    }


}

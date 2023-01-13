package Practice.Programm;

import Practice.JdbcUtil.JDBCUtil;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);

        try{
           connection = JDBCUtil.getConnection();


           statement = connection.createStatement();

//           String sqlQuery = scanner.next();
////           sqlQuery = String.format("'%s'",sqlQuery);
            String sqlQuery = "SELECT * FROM employee";

////           System.out.println(sqlQuery);
//
           boolean result = statement.execute(sqlQuery);
           System.out.println("exexcuted");

           if (result) {
               resultSet = statement.getResultSet();
               System.out.println();
               System.out.printf( "%5s%20s%15s%13s","Employee Id","Employee Name","Mobile No","Unit");
               System.out.println("\n_____________________________________________________________________");
               while (resultSet.next()){
                   System.out.printf("%8d%20s%18d%13s" , resultSet.getInt(1),
                                    resultSet.getString(2),resultSet.getInt(3),
                                    resultSet.getString(4));

                   System.out.println();
               }

           }
           else {
               int count = statement.getUpdateCount();
               System.out.println("Row affected is :: "+count);

           }

        }catch (SQLException | IOException exception){
            exception.printStackTrace();
        }


    }

}

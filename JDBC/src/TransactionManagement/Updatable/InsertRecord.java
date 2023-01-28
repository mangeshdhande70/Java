package TransactionManagement.Updatable;

import Practice.JdbcUtil.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {



    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);
        String sqlQuery = "SELECT * FROM employee";

        try{
            connection = JDBCUtil.getConnection();


            if (connection!=null)
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);


            assert statement != null;
            resultSet  = statement.executeQuery(sqlQuery);


            System.out.println("\n*********** Before Insertion ****************");
            if (resultSet!=null) {
                System.out.println("_______________________________________________________________");
                System.out.printf( "%5s%20s%15s%13s","Employee Id","Employee Name","Mobile No","Unit");
                System.out.println("\n_____________________________________________________________________");
                while (resultSet.next()){
                    System.out.printf("%8d%20s%18d%13s" , resultSet.getInt(1),
                            resultSet.getString(2),resultSet.getInt(3),
                            resultSet.getString(4));

                    System.out.println();
                }

            }


            assert resultSet != null;
            resultSet.moveToInsertRow();

            resultSet.updateInt(1,1204903);
            resultSet.updateString(2,"Rakesh");
            resultSet.updateInt(3,12900);
            resultSet.updateString(4,"ENG");

            resultSet.insertRow();


            resultSet.beforeFirst();

            System.out.println("\n********** After Insertion **************");

            System.out.println("___________________________________________________________________________");
            System.out.printf( "%5s%20s%15s%13s","Employee Id","Employee Name","Mobile No","Unit");
            System.out.println("\n_____________________________________________________________________");
            while (resultSet.next()){

                System.out.printf("%8d%20s%18d%13s" , resultSet.getInt(1),
                        resultSet.getString(2),resultSet.getInt(3),
                        resultSet.getString(4));

                System.out.println();

            }


        }catch (SQLException | IOException exception){
            exception.printStackTrace();
        }


    }



}

package TransactionManagement.Updatable;

import Practice.JdbcUtil.JDBCUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);
        String sqlQuery = "SELECT * FROM employee";

        try {
            connection = JDBCUtil.getConnection();


            if (connection != null)
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);


            assert statement != null;
            resultSet = statement.executeQuery(sqlQuery);


            System.out.println("\n*********** Before Insertion ****************");
            if (resultSet != null) {
                System.out.println("_________________________________________________________________________________________");
                System.out.printf("%5s%20s%15s%13s%12s", "Employee Id", "Employee Name", "Mobile No", "Unit","Salary");
                System.out.println("\n_____________________________________________________________________________");
                while (resultSet.next()) {
                    System.out.printf("%8d%20s%18d%13s%12d", resultSet.getInt(1),
                            resultSet.getString(2), resultSet.getInt(3),
                            resultSet.getString(4),resultSet.getInt(8));

                    System.out.println();
                }

            }


            assert resultSet != null;
            resultSet.beforeFirst();

            System.out.println("Please press Enter to Run Application");
            System.in.read();

            while (resultSet.next()) {
                int originalSalary = resultSet.getInt("salary");
                if (originalSalary < 10000) {
                    int increaseSalary = originalSalary + 2000;
                    resultSet.updateInt(8, increaseSalary);
                    resultSet.updateRow();
                }
            }

            resultSet.beforeFirst();

            System.out.println("\n********** After Insertion **************");

            System.out.println("____________________________________________________________________________________");
            System.out.printf("%5s%20s%15s%13s%12s", "Employee Id", "Employee Name", "Mobile No", "Unit","Salary");
            System.out.println("\n_____________________________________________________________________");
            while (resultSet.next()) {

                System.out.printf("%8d%20s%18d%13s%12d", resultSet.getInt(1),
                        resultSet.getString(2), resultSet.getInt(3),
                        resultSet.getString(4),resultSet.getInt("salary"));

                System.out.println();

            }


        } catch (SQLException | IOException exception) {
            exception.printStackTrace();
        }

    }
}
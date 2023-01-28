package TransactionManagement.Scrollable;

import MyCode.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableApp {

    public static void main(String[] args) {

        // Resources used
        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcUtil.getJDBCConnection();

            if (connection != null)
                // Expecting ResultSet to be SCROLLABLE AND UPDATABLE
                stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sqlQuery = "select id,name,lastName,mailId,mobNo from student";

            if (stmt != null)
                resultSet = stmt.executeQuery(sqlQuery);

            if (resultSet != null) {

                System.out.println("MOVING IN FORWARD DIRECTION...");
                System.out.println("ID\tNAME\tLASTNAME\tMAIL_ID\tMOB_NO");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                                "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                                    "\t"+resultSet.getInt(5));
                }

                System.out.println();

                System.out.println("MOVING IN BACKWARD DIRECTION...");
                System.out.println("ID\tNAME\tLASTNAME\tMAIL_ID\tMOB_NO");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                            "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                            "\t"+resultSet.getInt(5));
                }

                System.out.println();

                resultSet.first();// cursor will be moved to first record
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.last();// cursor will be moved to last record
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.first();// takes the cursor to first row.

                resultSet.absolute(3);// from the begining of the resultSet
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.relative(2);// from the current position move downwards
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.first();// takes the cursor to first row
                resultSet.absolute(2);// takes the cursor to 2nd position
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.relative(-1);// from the current cursor position move the cursor 1step in backward direction
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.absolute(5); // from the BFR take the cursor to 5th position
                resultSet.relative(-2);// from the current cursor position take the cursor 2 steps in backward direction
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.relative(5);// from the current cursor position take the cursor 5 steps in forward direction
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.absolute(-5);// from the ALR move the cursor in backward direction
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.last();//take the cursor to last row
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));

                resultSet.relative(-1);//from the current cursor position move the cursor 1step in backward direction
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
                        "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4)+
                        "\t"+resultSet.getInt(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                JdbcUtil.cleanUp(connection, stmt, resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
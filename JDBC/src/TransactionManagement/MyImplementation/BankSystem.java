package TransactionManagement.MyImplementation;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankSystem {


    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Account No");
        int accNo = scanner.nextInt();

        System.out.println("Enter Your PIN");
        int pin = scanner.nextInt();

//        System.out.println("Before the Transaction");
//        accountBalance(accNo , pin);

        sendMoney(accNo , pin);


    }

    public static void sendMoney(int accNo , int pin) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement1= null;
        PreparedStatement preparedStatement2= null;
        Scanner scanner = new Scanner(System.in);
        int rowAffectedSender;
        int rowAffectedReceiver;

        System.out.println("How many money you want to transfer");
        int amount = scanner.nextInt();


        System.out.println("Receiver account no ");
        int receiverAccountNo = scanner.nextInt();


        String sqlQuery = "UPDATE bank SET balance= balance - ? where accountno = ? ";

        String sqlQuery2 = "UPDATE bank SET balance = balance + ? where accountno = ?";

        try {

            connection = JdbcUtil.getJDBCConnection();

            connection.setAutoCommit(false);

            preparedStatement1 = connection.prepareStatement(sqlQuery);
            preparedStatement2 = connection.prepareStatement(sqlQuery2);

            preparedStatement1.setInt(1,amount);
            preparedStatement1.setInt(2,accNo);

            preparedStatement2.setInt(1,amount);
            preparedStatement2.setInt(2,receiverAccountNo);

            rowAffectedSender = preparedStatement1.executeUpdate();

            rowAffectedReceiver = preparedStatement2.executeUpdate();

            connection.commit();

            if (rowAffectedSender!=0 && rowAffectedReceiver!=0)
                System.out.println("Transaction Successfully Done.......\n");


            System.out.println("Do you want to check your Bank Balance :: [YES/NO]");
            String option = scanner.next();

            if (option.equalsIgnoreCase("yes")) {
                accountBalance(accNo , pin);
            }
//            if (rowAffectedReceiver!=0) {
//                System.out.println("Receiver Balance");
//                accountBalance(receiverAccountNo);
//            }


        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.cleanUp(connection,preparedStatement1, null);
            JdbcUtil.cleanUp(null , preparedStatement2 , null);
        }
    }

    public static void accountBalance(int accNo , int pin ) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sqlQuery = "SELECT `custname`,`balance` FROM bank WHERE accountno = ?  AND pin =?";

        Scanner scanner = new Scanner(System.in);



        try {
            connection = JdbcUtil.getJDBCConnection();

            if (connection!=null)
                preparedStatement = connection.prepareStatement(sqlQuery);

            if (preparedStatement!=null) {
                preparedStatement.setInt(1, accNo);
                preparedStatement.setInt(2,pin);
                resultSet = preparedStatement.executeQuery();
            }

            assert resultSet != null;
            if (resultSet.next()) {
                System.out.println("Hello... "+resultSet.getString(1));
                System.out.println("Your Account Balance is :: "+resultSet.getInt(2));
            }else {
                System.out.println("You Entered Wrong pin.....Try Once Again");
                System.out.println("Enter Your Pin");
                pin = scanner.nextInt();
                accountBalance(accNo , pin);

            }

        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtil.cleanUp(connection,preparedStatement,resultSet);
        }
    }

}

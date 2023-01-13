package PreparedStatement;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchSecond {

    public static void main(String[] args) throws SQLException {


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Choice");

        Integer choice = scanner.nextInt();

        switch (choice){






        }



    }


    public static void addingStudent(Connection connection , PreparedStatement preparedStatement , Scanner scanner) throws SQLException {
        try{

            if (connection!=null)
                connection = JdbcUtil.getJDBCConnection();

            String sqlInsertQuery = "INSERT INTO student(name,lastName,mailId,mobNo,age,course) Values (?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sqlInsertQuery);


            scanner = new Scanner(System.in);

            System.out.println("Enter Name");
            String name = scanner.nextLine();

            System.out.println("Enter Last Name");
            String lastName = scanner.next();

            System.out.println("Enter Mail Id");
            String mailId = scanner.next();

            System.out.println("Enter Mobile No");
            Integer mobNo = scanner.nextInt();

            System.out.println("Enter Age");
            Integer age = scanner.nextInt();

            System.out.println("Enter course");
            Integer course = scanner.nextInt();


//            preparedStatement.setInt(1,99);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,mailId);
            preparedStatement.setInt(4,mobNo);
            preparedStatement.setInt(5,age);
            preparedStatement.setInt(6,course);

            int rowAffected = preparedStatement.executeUpdate();

//             = preparedStatement.getUpdateCount();

            System.out.println("Row Affected are :: "+rowAffected);


        } catch (SQLException e) {
            System.out.println("You Already Register");
            System.out.println("Please Log in ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            JdbcUtil.cleanUp(connection,preparedStatement,null);
            System.out.println("Closing the Resources");

        }
    }




    public static void updateData() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;


        try{

            if (connection!=null)
                connection = JdbcUtil.getJDBCConnection();

            String sqlInsertQuery = "UPDATE TABLE student SET course = ? WHERE id = ?";

            preparedStatement = connection.prepareStatement(sqlInsertQuery);


            scanner = new Scanner(System.in);

            System.out.println("Enter ID");
            Integer id = scanner.nextInt();


            System.out.println("Enter course");
            Integer course = scanner.nextInt();


//            preparedStatement.setInt(1,99);
            preparedStatement.setInt(1,id);
            preparedStatement.setInt(2,course);

            int rowAffected = preparedStatement.executeUpdate();

//             = preparedStatement.getUpdateCount();

            System.out.println("Row Affected are :: "+rowAffected);


        } catch (SQLException e) {
            System.out.println("You Already Register");
            System.out.println("Please Log in ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {

            JdbcUtil.cleanUp(connection,preparedStatement,null);
            System.out.println("Closing the Resources");

        }


    }


}

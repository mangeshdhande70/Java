package DateAndTIme.DateInsertionInDb;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class launchFirst {


    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        String dob = null;
        String doj = null;
        java.util.Date dateJava = null;
        java.sql.Date dateSql = null;

        String sqlQuery = "insert into student(`name`,`lastName`,`mailId`,`mobNo`,`age`,`course`,`dob`,`doj`)" +
                " values(?,?,?,?,?,?,?,?)";


        try{
            connection = JdbcUtil.getJDBCConnection();
            if(connection!=null)
                preparedStatement = connection.prepareStatement(sqlQuery);

            if (preparedStatement!=null) {
                scanner = new Scanner(System.in);
                try {
                    System.out.println("Enter name");
                    preparedStatement.setString(1, scanner.next());

                    System.out.println("Enter Last Name");
                    preparedStatement.setString(2, scanner.next());

                    System.out.println("Enter Email Id");
                    preparedStatement.setString(3, scanner.next());


                    System.out.println("Enter Mobil No");
                    preparedStatement.setInt(4, scanner.nextInt());

                    System.out.println("Enter age");
                    preparedStatement.setInt(5, scanner.nextInt());


                    System.out.println("Enter course");
                    preparedStatement.setInt(6, scanner.nextInt());


                    System.out.println("Enter Date Of Birth in (dd-MM-yyyy) format");
                    dob = scanner.next();
                }catch (NumberFormatException e)
                {
                    e.printStackTrace();
                }


                if (dob!=null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    dateJava = simpleDateFormat.parse(dob);
                    long date = dateJava.getTime();

                    dateSql = new Date(date);

                }
                preparedStatement.setDate(7,dateSql);


                System.out.println("Enter Date Of Joining in (yyyy-MM-dd) format");
                doj = scanner.next();
                dateSql = java.sql.Date.valueOf(doj);
                preparedStatement.setDate(8,dateSql);


                int rowAffected = preparedStatement.executeUpdate();

                if (rowAffected!=0)
                    System.out.println("Record save successfully & Row affected are :: "+rowAffected);
                else
                    System.out.println("sorry...your record not save in DB");

            }

        } catch (SQLException | IOException | ParseException e) {
            throw new RuntimeException(e);
        }finally {
            assert scanner != null;
            scanner.close();
            JdbcUtil.cleanUp(connection,preparedStatement,null);
        }
    }

}

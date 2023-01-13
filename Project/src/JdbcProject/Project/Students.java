package JdbcProject.Project;


import JdbcProject.jdbcutil.JdbcUtil;

import javax.lang.model.type.IntersectionType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Students {


    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = new Scanner(System.in);

        try{

            connection = JdbcUtil.getJdbcConnection();


        }catch (IOException | SQLException exception){
            exception.printStackTrace();
        }


        System.out.println("******** MENU ********");

        System.out.println("1. Press 1 for Insert operation\n" +
                           "2. Press 2 for select operation\n"+
                           "3. Press 3 for Update operation\n"+
                           "4. Press 4 for Delete operation\n" +
                           "5. Press 5 for All Student Detail\n"+
                           "6. Press 6 for exit ");


//        System.out.println("Enter Your Choice");



        while (true) {
            System.out.println("Select Your Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent(connection , scanner );
                    break;
                case 2:
                    searchForStudentById(connection , scanner);
                    break;
                case 3:
                    updateStudentDetails(connection , scanner);
                    break;
                case 4:
                    deleteStudent(connection , scanner);
                    break;
                case 5:
                    getAllStudents();
                case 6:
                    System.exit(0);break;
                default:System.out.println("Invalid Operation");

            }
        }

    }


    public static void addStudent(Connection connection , Scanner scanner){

        PreparedStatement preparedStatement = null;

        String insertQuery = "INSERT INTO student(`sname`,`sage`,`saddres`) VALUES(?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(insertQuery);

            System.out.println("Enter Name Of Student");
            preparedStatement.setString(1,scanner.next());

            System.out.println("Enter Age Of Student");
            preparedStatement.setInt(2,scanner.nextInt());

            System.out.println("Enter Address Of Student");
            preparedStatement.setString(3,scanner.next());

            int rowAffected = preparedStatement.executeUpdate();

            System.out.println("Record Inserted successfully , Row Affected is :: "+rowAffected);


        }catch (SQLException exception){
            System.out.println("Record Insertion Failed");
//            exception.printStackTrace();
        }

    }

    public static void searchForStudentById(Connection connection,Scanner scanner) {


        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sqlSelectQuery = "SELECT * FROM student where sid = ?";

        try {
            preparedStatement = connection.prepareStatement(sqlSelectQuery);

            System.out.println("Enter Your Id to Get the Data");
            int id = scanner.nextInt();
            preparedStatement.setInt(1,id);
            resultSet =  preparedStatement.executeQuery();


            if (resultSet.next()){

                System.out.println(" Id\t |   Name\t | Age\t| Address |");
                System.out.println("_____________________________________");
                System.out.println(" "+
                                    resultSet.getInt(1)+"\t |  "+
                                    resultSet.getString(2)+"\t |  "+
                                    resultSet.getInt(3)+"\t| "+
                                    resultSet.getString(4)+" |\n");
            }
            else System.out.println("Record Not Found For "+id);


        }catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }

    }

    public static void getAllStudents(){

    }

    public static void updateStudentDetails(Connection connection , Scanner scanner){

        PreparedStatement preparedStatement = null;
        String sqlUpdateQuery = "UPDATE student SET sname=?,sage=?,saddres=? where sid = ?";

        System.out.println("Enter Your Id");
        Integer id = scanner.nextInt();

        try {
            preparedStatement = connection.prepareStatement(sqlUpdateQuery);

            System.out.println("Enter Name");
            String name = scanner.next();

            System.out.println("Enter Age");
            Integer age = scanner.nextInt();

            System.out.println("Enter address");
            String address = scanner.next();
//            address = System.console().readLine();
            System.out.println(address);

            if (name!=null)
                preparedStatement.setString(1,name);
            else {
                preparedStatement.setString(1,"Ketan");
            }

            if (age!=null) {
                preparedStatement.setInt(2,age);
            }
            else {

                preparedStatement.setInt(2,0);
            }


            if (address!=null) {
                preparedStatement.setString(3,address);
            }
            else {

                preparedStatement.setString(3,"Mumbai");
            }

            preparedStatement.setInt(4,id);

            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected!=0) System.out.println("Your Data is Successfully Updated");
            else System.out.println("Your Data not Successfully Updated");


        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static void deleteStudent(Connection connection , Scanner scanner){


        PreparedStatement preparedStatement = null;
        String sqlDeleteQuery = "DELETE FROM student WHERE sid = ?";

        try {
            preparedStatement = connection.prepareStatement(sqlDeleteQuery);

            System.out.println("Enter Your Id");
            preparedStatement.setInt(1,scanner.nextInt());
           int rowAffected =  preparedStatement.executeUpdate();


           if (rowAffected!=0) System.out.println("Record Deleted Successfully.");
           else System.out.println(" Record not available for the given id.");


        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

}

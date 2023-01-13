package Basics;

import java.sql.*;

public class Practice {


    public static void main(String[] args) {

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully....");


            String url = "jdbc:mysql://localhost:3306/ineuron";
//            String url = "jdbc:mysql://localhost:3306/ineuron";
            String user = "root";
            String pass = "Md7$#1998";

           connection = DriverManager.getConnection(url,user,pass);

           statement = connection.createStatement();

           String sqlQuery = "select * from student s inner join courses c on s.course = c.courseid order by id asc";
           resultSet =  statement.executeQuery(sqlQuery);


          System.out.println();
          System.out.println("Id\t\tName\t\tLastName\t\tMailId\t\t\tMobNo" +
                    "\t\tAge\t\tCourse\t\tCourse Id\t\tCourse Name");

          System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");


          while (resultSet.next())
          {
              Integer id = resultSet.getInt(1);
              String name = resultSet.getString(2);
              String lastName = resultSet.getString(3);
              String mailId = resultSet.getString(4);
              Integer mobNo = resultSet.getInt(5);
              Integer age = resultSet.getInt(6);
              Integer course = resultSet.getInt(7);
              Integer courseId = resultSet.getInt(8);
              String courseName = resultSet.getString(9);

              System.out.println(id+"\t\t"+name+"\t\t"+lastName+"\t\t  "
                      +mailId+"\t\t"+mobNo+"\t\t"+age+
                      "\t\t   "+course+"\t\t\t"+courseId+"\t\t\t "+courseName);

          }


        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}

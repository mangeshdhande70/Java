package JdbcProject.All_In_One.com.persistent;

import JdbcProject.All_In_One.com.dto.Employee;
import JdbcProject.All_In_One.jdbcconnection.JdbcConnection;
import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class EmployeeDaoImpl implements IEmployeeDao {


    @Override
    public String addingEmployee(String name, Integer mobNo, String unit) {
        return null;
    }

    @Override
    public String updateDOJEmployee(Integer id,String doj ) {

        java.util.Date doj1 = null;
        java.sql.Date dojSql = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sqlQuery = "UPDATE employee SET doj = ? WHERE empid = ?";

        try {
                   connection = JdbcConnection.jdbcConnection();

                   preparedStatement = connection.prepareStatement(sqlQuery);

                   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                   doj1 = simpleDateFormat.parse(doj);
                   long date =  doj1.getTime();
                   dojSql = new Date(date);


                   preparedStatement.setDate(1,dojSql);
                   preparedStatement.setInt(2,id);

                   int rowAffected = preparedStatement.executeUpdate();

                   if (rowAffected!=0)
                       System.out.println("Date Of Joining Updated ..........");
                   else
                       System.out.println("Failed to Update Date of Joining ");



        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcConnection.cleaUpResources(connection,preparedStatement,null);
        }


        return null;
    }


    public String updateDOBEmployee(Integer id,String dob ){



        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sqlQuery = "UPDATE employee SET dob =? WHERE empid =?";
        java.sql.Date dob1 = null;

        String result = null;
        int rowAffected = 0;

        connection = JdbcConnection.jdbcConnection();

        try {
            if (connection!=null)
                  preparedStatement = connection.prepareStatement(sqlQuery);


              dob1 = Date.valueOf(dob);


            if (preparedStatement!=null) {
                preparedStatement.setDate(1, dob1);
                preparedStatement.setInt(2, id);
                rowAffected = preparedStatement.executeUpdate();
            }


            if (rowAffected!=0)
                result = "DOB Updated Successfully";
            else
                result = "Failed to Update DOB";

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  result;

    }

    @Override
    public Employee getEmployeeDetails(Integer id) {
        return null;
    }

    @Override
    public String deleteEmployeeDetails(Integer id) {
        return null;
    }


    public String addPhoto(String photoPath, Integer id) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String result = null;

        String addPhotoSqlQuery = "UPDATE employee SET photo=? WHERE empid = ?";

        try {

            connection = JdbcConnection.jdbcConnection();

            preparedStatement = connection.prepareStatement(addPhotoSqlQuery);

            FileInputStream fis = new FileInputStream(photoPath);

            preparedStatement.setBinaryStream(1, fis, fis.available());

            preparedStatement.setInt(2, id);

            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected != 0)
                result = "Done.................";
            else
                result = "Failed................";


        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcConnection.cleaUpResources(connection,preparedStatement,null);
        }
        return result;
    }


    @Override
    public void getPhoto(Integer id, String fileName) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSEt = null;
        String selectSqlQuery = "SELECT photo FROM employee WHERE empid=?";

        try {

            connection = JdbcConnection.jdbcConnection();

            preparedStatement = connection.prepareStatement(selectSqlQuery);


            preparedStatement.setInt(1, id);

            resultSEt = preparedStatement.executeQuery();


            File file = new File(fileName);

            FileOutputStream fos = new FileOutputStream(file);

            System.out.println("Writing to file " + file.getAbsolutePath());
            while (resultSEt.next()) {
                InputStream input = resultSEt.getBinaryStream("photo");
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    fos.write(buffer);
                }
            }

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}

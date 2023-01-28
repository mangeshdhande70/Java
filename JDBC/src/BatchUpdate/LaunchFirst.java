package BatchUpdate;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchFirst {


    public static void main(String[] args) {


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner scanner = null;
        String sql = "insert into student(`name`,`lastName`,`mailId`,`mobNo`,`age`,`course`,`dob`,`doj`)" +
                "Values ";


        try{

            connection = JdbcUtil.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);




        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }





}

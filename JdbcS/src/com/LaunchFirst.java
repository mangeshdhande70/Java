package com;

import connection.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class LaunchFirst {


    public static void main(String[] args) {

        System.out.println("Hello World");

        Connection connection = null;
        PreparedStatement prepareStatement = null;
        ResultSet resultSet = null;
        String sqlQueryString = "SELECT * FROM student";

        try {

            connection = JdbcConnection.getJdbcConnection();

            System.out.println("Hello World");

            if (connection != null)
                prepareStatement = connection.prepareStatement(sqlQueryString);

            if (prepareStatement != null)
                resultSet = prepareStatement.executeQuery();

            System.out.println(resultSet);

            if (resultSet != null) {

                System.out.println("\tId\tName\tLast Name\tMail Id\tMob No\tAge\tCourse\tDOB\tDOJ");

                while (resultSet.next()) {

//					Date date = resultSet.getDate(8);

                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    String dob = simpleDateFormat.format(resultSet.getDate(8));
                    String doj = simpleDateFormat.format(resultSet.getDate(9));

                    System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t"
                            + resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5) + "\t"
                            + resultSet.getInt(6) + "\t" + resultSet.getInt(7) + dob + "\t" + doj);

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



}

package CallableStatement;

import MyCode.JdbcUtil;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class LaunchFirst {


    private final static String sql = "{CALL P_GET_PRODUCT_DETAILS_BY_ID(?,?,?,?)}";


    public static void main(String[] args) {

        Connection connection = null;
        CallableStatement callableStatement = null;
        Scanner scanner = null;
        Integer id = null ;

        try{

            connection = JdbcUtil.getJDBCConnection();

            if (connection!=null)
               callableStatement = connection.prepareCall(sql);

            scanner =new Scanner(System.in);

            System.out.println("Enter your Id");
            id = scanner.nextInt();

            if (callableStatement!=null)
                callableStatement.setInt(1,id);


            if (callableStatement!=null) {
                callableStatement.registerOutParameter(2, Types.VARCHAR);
            }

            if (callableStatement!=null)
                callableStatement.execute();

            if (callableStatement!=null)
                System.out.println(callableStatement.getString(2));



        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }







}

package MyCode;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LaunchFirst {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

                connection = JdbcUtil.getJDBCConnection();

            if(connection!=null)
                statement=  connection.createStatement();


            String sqlQuery = " Select * from student";

            if(statement!=null)
                resultSet = statement.executeQuery(sqlQuery);

//            String sqlQuery = "select id,name,lastName,mailId,mobNo,age,course from student";

            System.out.println();
            System.out.printf("%s%11s%16s%15s%17s%10s%12s","Id","Name","Last Name","Mail Id","Mob No","Age","Course");
            System.out.println("\n________________________________________________________________________________________________");
            while (resultSet.next()){


                System.out.printf("%1d%12s%13s%20s%15d%10d%10d",
                        resultSet.getInt(1),
                        resultSet.getString(2),resultSet.getString(3),
                        resultSet.getString(4), resultSet.getInt(5),
                        resultSet.getInt(6),resultSet.getInt(7));
                System.out.println();

            }


        }
        catch (SQLException | IOException exception ) {
            exception.printStackTrace();
        }finally {
            try{
                JdbcUtil.cleanUp(connection,statement,resultSet);
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }


    }



}

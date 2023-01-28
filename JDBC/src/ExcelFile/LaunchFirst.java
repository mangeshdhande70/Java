package ExcelFile;

import java.sql.*;

public class LaunchFirst {


    private static final String EXCEL_FILE = "select * from sheet.student";

    public static void main(String[] args) {

        String url = "jdbc:Excel:///D://Study";

        try(Connection connection = DriverManager.getConnection(url)) {
            try(PreparedStatement p = connection.prepareStatement(EXCEL_FILE)){
                try(ResultSet resultSet = p.executeQuery()){
                    while (resultSet.next()){
                        System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}

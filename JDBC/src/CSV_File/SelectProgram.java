package CSV_File;

import java.sql.*;

public class SelectProgram {

    private static final String EXCEL_CSV = "select * from Data.csv";

    public static void main(String[] args) {

        String url = "jdbc:Text:///D:\\Study";

        try(Connection connection = DriverManager.getConnection(url)) {
            try(PreparedStatement p = connection.prepareStatement(EXCEL_CSV)){
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

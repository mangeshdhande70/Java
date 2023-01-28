package ExcelFile;

import java.sql.*;
import java.util.Scanner;

public class Insertion {




    private static final String EXCEL_FILE = "insert into sheet.student values(?,?)";

    public static void main(String[] args) {

        String name = null;
        Integer id =null;
        Scanner scanner = null;

        try{
            scanner = new Scanner(System.in);
            System.out.println("Enter Id");
            id = scanner.nextInt();

            System.out.println("Enter name");
            name = scanner.next();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            assert scanner != null;
            scanner.close();
        }



        String url = "jdbc:Excel:///D://Study";

        try(Connection connection = DriverManager.getConnection(url)) {
            try(PreparedStatement p = connection.prepareStatement(EXCEL_FILE)){

                p.setInt(1 , id);
                p.setString(2,name);

                int count = p.executeUpdate();

                if (count == 0)
                    System.out.println("Record Not inserted......");
                else
                    System.out.println("Record inserted ...."+count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}

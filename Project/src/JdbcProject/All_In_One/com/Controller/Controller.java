package JdbcProject.All_In_One.com.Controller;

import JdbcProject.All_In_One.com.persistent.EmployeeDaoImpl;
import JdbcProject.All_In_One.com.persistent.IEmployeeDao;

import java.util.Scanner;

public class Controller {


    public static void main(String[] args) {


        IEmployeeDao iEmployeeDao = new EmployeeDaoImpl();


        Scanner scanner = new Scanner(System.in);

        /**
         * For adding Employee
         */
//        System.out.println("select location of photo");
        String path = "D://mangesh.dhande//OneDrive - Infosys Limited//Desktop//Doc//photoM.jpg";

        System.out.println("Enter your Id ");
        Integer id = scanner.nextInt();


        String fileName = "MangeshPhoto.jpg";
//
//        assert false;
//        String result = iEmployeeDao.addPhoto(path,id);
//
//        System.out.println(result);


//        iEmployeeDao.getPhoto(id,fileName);


        System.out.println("please Enter your Data Of Joining in (dd-MM-yyyy) Format");

        String doj = scanner.next();

        iEmployeeDao.updateDOJEmployee(id,doj);


        System.out.println("please Enter your Data Of Birth in (yyyy-MM-dd) Format");

        String dob = scanner.next();

       String result = iEmployeeDao.updateDOBEmployee(id,dob);

       System.out.println(result);



    }





}

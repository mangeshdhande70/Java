package JdbcProject.All_In_One.com.persistent;

import JdbcProject.All_In_One.com.dto.Employee;

public interface IEmployeeDao {


    public String addingEmployee(String name , Integer mobNo , String unit);

    public String updateDOJEmployee(Integer id , String doj);

    public String updateDOBEmployee(Integer id,String doj );

    public Employee getEmployeeDetails(Integer id);

    public String deleteEmployeeDetails(Integer id);

    public String addPhoto(String photoPath , Integer id);


    public void getPhoto(Integer id , String path );
}

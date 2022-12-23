package MethodReference;


interface Demo{

    void demo(int empId , String name);

}

public class MethodRef {

    public void method(int empId , String empName)
    {

        System.out.println("Employee Id :: "+empId+" , Employee Name :: "+empName);

    }


    public static void main(String[] args) {

        MethodRef objOfMethodOfRef = new MethodRef();

        Demo obj = objOfMethodOfRef::method;

        obj.demo(12 , "Mangesh");
        obj.demo(13 , "Dhande");

    }


}

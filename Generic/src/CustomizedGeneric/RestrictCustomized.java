package CustomizedGeneric;

// Number is a Parent class of Integer, Float, Long, Short, Byte, Double..etc.

class Employee<T extends Number>
{
    T type;
    public Employee(T type)
    {
        this.type = type;

    }

    public void show()
    {
        System.out.println("The Type of Object is :: "+type.getClass().getName());
    }

    public T getObject()
    {
        return type;
    }

}

// if there is class or interface then keyword use is extends only not implements or super
class Customer<T extends Runnable>
{
    T type;
    public Customer(T type)
    {
        this.type = type;

    }

    public void display()
    {
        System.out.println("The Type of Object is :: "+type.getClass().getName());
    }

    public T getObject1()
    {
        return type;
    }

}


public class RestrictCustomized {


    public static void main(String[] args) {



        Employee<Integer> employee = new Employee<>(56);
        employee.show();
        System.out.println(employee.getObject());

        System.out.println();

        Employee<Float> employee1 = new Employee<>(67.6f);
        employee1.show();
        System.out.println(employee1.getObject());

        System.out.println();

        //    incompatible types: java.lang.String cannot be converted to java.lang.Number
        //    Employee employee2 = new Employee("Hitesh");


    }



}

package SerializationandDeSerialization.Customize;


import java.io.*;

class Employee implements Serializable{

    String empName = "Mangesh";
    long empId = 1204321l;
    transient long salary = 21300l; // here salary is Confidential data so, declare as transient.
                                    // if u print this data output bcm 0.

    /**
     *  if u want to save and transfer transient object value by Serialization u need to Override these
        two method (writeObject and readObject) .

     * here, when u perform serialization u can encrypt the data and while de-serialization u can decrypt the data.

     */
     private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {

         // To write other than transient Object.
         objectOutputStream.defaultWriteObject();
         long salary1 = salary+01200;
         objectOutputStream.writeObject(salary1);

    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {

         objectInputStream.defaultReadObject();
         long salary1 = (long)objectInputStream.readObject();
         salary = salary1-01200;

    }


}

public class LaunchSecond {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Employee employee = new Employee();

        System.out.println("Serialization Started......................");

        String fileName = "emp.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);

        System.out.println("Serialization Ended..........");

        System.in.read();

        System.out.println("De-Serialization Started......................");

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee1 = (Employee) objectInputStream.readObject();

        String empName =  employee1.empName;
        long empId =  employee1.empId;
        long salary = employee1.salary;

        System.out.println("Employee Name :: "+empName);
        System.out.println("Employee Id :: "+empId);
        System.out.println("Employee Salary :: "+salary);

        System.out.println("De-Serialization Ended..........");






    }


}

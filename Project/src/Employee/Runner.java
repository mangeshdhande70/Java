package Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {


        Address address = new Address("Nagpur" , 442404);
        Address address1 = new Address("Chandrapur" , 442401);
        Address address2 = new Address("Ballarpur" , 442403);
        Address address3 = new Address("Nagpur" , 442404);
        Address address4 = new Address("Chandrapur" , 442401);
        Address address5 = new Address("Nagpur" , 442404);



        PersonalDetails personalDetails = new PersonalDetails("7030765414" , 363045653l);
        PersonalDetails personalDetails1 = new PersonalDetails("9930765414" , 463045653l);
        PersonalDetails personalDetails2 = new PersonalDetails("7430765414" , 563045653l);
        PersonalDetails personalDetails3 = new PersonalDetails("8030765414" , 63045653l);
        PersonalDetails personalDetails4 = new PersonalDetails("9030765414" , 763045653l);
        PersonalDetails personalDetails5 = new PersonalDetails("7530765414" , 863045653l);


//        LocalDate LocalDate = LocalDate.ofLocalizedDateTime()

        Employee employee = new Employee("Mangesh Dhande" , 1204343L , "IOT" ,
                                            "Nagpur",
                       LocalDate.of(2021,12,24), address ,personalDetails);


        Employee employee1 = new Employee("Ashish Dhok" , 1104343L , "SAP" ,
                "Nagpur",
                LocalDate.of(2021,9,13), address1 ,personalDetails1);


        Employee employee2 = new Employee("Shubham Kokode" , 1204310L , "FSSTAR" ,
                "Nagpur",
                LocalDate.of(2021,12,24), address2 ,personalDetails2);


        Employee employee3 = new Employee("Jayant Karemore" , 1204243L , "IOT" ,
                "Nagpur",
                LocalDate.of(2021,12,24), address3 ,personalDetails3);


        Employee employee4 = new Employee("Vivek Peddaboina" , 1304343L , "SAP" ,
                "Nagpur",
                LocalDate.of(2022,2,12), address4 ,personalDetails4);



        Employee employee5 = new Employee("Karishma Sinha" , 1344343L , "SAP" ,
                "Nagpur",
                LocalDate.of(2022 , 02 ,12), address5 ,personalDetails5);


        TreeSet<Employee> treeSet = new TreeSet<Employee>(new MyComparator());

        treeSet.add(employee);
        treeSet.add(employee5);
        treeSet.add(employee4);
        treeSet.add(employee3);
        treeSet.add(employee2);
        treeSet.add(employee1);


        System.out.println(treeSet);



        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println("\n\n"+iterator.next());
        }

        System.out.println("***** Same Joining Date ******");
        getSameDateJoining(treeSet);

    }



    public static void getSameDateJoining(TreeSet<Employee> treeSet)
    {

         LocalDate localDate = LocalDate.now();



//
//         System.out.println("now");
//         System.out.println(localDate);

//        LocalDate localDate1 =  employee.getDateOfJoining();

//         treeSet.stream().filter((localDate , employee.getEmployeeId()) -> localDate.compareTo(employee.getDateOfJoining()))

//        for (Employee employeee:
//             treeSet) {
//            if (localDate.compareTo(employeee.getDateOfJoining())==0)
//            {
//                List<Employee> list = treeSet.stream().collect(Collectors.toList());
//            }
//
//        }


//        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.YEARS);

      List<Employee> list =   treeSet.stream().filter(emp -> emp.getDateOfJoining().compareTo(LocalDate.now().
                            minus(365, ChronoUnit.DAYS))==0).

              collect(Collectors.toList());


      list.forEach(System.out::println);


    }



}

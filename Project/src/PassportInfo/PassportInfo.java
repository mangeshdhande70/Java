package PassportInfo;


import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;



class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer c1 = (Integer) o1;
        Integer c2 = (Integer) o2;

//        Integer age1 = (Integer) c1.getAge();
//        System.out.println(age1);
//        Integer age2 = (Integer) c2.getAge();
//        System.out.println(age2);

//        return age1.compareTo(age2);

        return c2.compareTo(c1);
    }
}


class Address{

    private Integer pinCode;
    private String city;


    public Address(Integer pinCode , String city)
    {
        this.pinCode = pinCode;
        this.city = city;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", city='" + city + '\'' +
                '}';
    }
}



class Citizen{

    private String name;
    private Integer age;
    private String gender;

    Address address;


    public Citizen(String name , Integer age , String gender , Address address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return " Citizen { " +
                "name = '" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=  " + address +
                '}';
    }
}

public class PassportInfo {


    public static void main(String[] args) {

        Address a1 = new Address(442401,"Ballarpur");
        Address a2 = new Address(442422,"Nirli");
        Address a3 = new Address(442423,"Amravatir");
        Address a4 = new Address(442404,"Nagpur");
        Address a5 = new Address(442405,"Chnadrapur");



        Citizen citizen  = new Citizen("Shubham" , 26,"male" ,a1 );
        Citizen citizen1 = new Citizen("Mangesh" , 24,"male" ,a2 );
        Citizen citizen2 = new Citizen("Akash" , 28,"male" ,a3 );
        Citizen citizen3 = new Citizen("Jayant" , 20,"male" ,a4 );
        Citizen citizen4 = new Citizen("Ankush" , 21,"male" ,a5 );


        TreeMap<Integer , Citizen> treeMap = new TreeMap<>(new MyComparator());

        treeMap.put(111,citizen);
        treeMap.put(222,citizen1);
        treeMap.put(333,citizen2);
        treeMap.put(444,citizen3);
        treeMap.put(555,citizen4);


        System.out.println(treeMap);



        System.out.println("\n\n");


        Set set = treeMap.entrySet();

        Iterator iterator = set.iterator();


        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }








    }


}

import java.util.*;

public class base {
    public static void main(String[] args) {

        Map<Integer, Student> map = new Hashtable<>();

        Hashtable<Integer,Student> m = new Hashtable<>();

//        System.out.println(map.size());
//          int rollNo = 1043;
//        rollNo = hashFunction(rollNo);


        Student s1 = new Student();
        s1.setRollNo(1043);
        s1.setName("Ankit");
        s1.setDepartment("EE");


        Student s2 = new Student();
        s2.setRollNo(1044);
        s2.setName("Dik's");
        s2.setDepartment("EE");


        Student s3 = new Student();
        s3.setRollNo(1048);
        s3.setName("Ketan");
        s3.setDepartment("CSE");


        Student s4 = new Student();
        s4.setRollNo(1049);
        s4.setName("Vivek");
        s4.setDepartment("ME");


        Student s5 = new Student();
        s5.setRollNo(1041);
        s5.setName("Akash");
        s5.setDepartment("EE");

        Student s6 = new Student();   // collision bcz at index 3 data is already stored but after this
                                      // the previous data will vanish and these data will be stored at index 3
        s6.setRollNo(1043);
        s6.setName("Ankit");
        s6.setDepartment("English Lit");




        map.put(hashFunction(s1.getRollNo()), s1);
        map.put(hashFunction(s2.getRollNo()), s2);
        map.put(hashFunction(s3.getRollNo()), s3);
        map.put(hashFunction(s4.getRollNo()), s4);
        map.put(hashFunction(s5.getRollNo()), s5);
        map.put(hashFunction(s6.getRollNo()), s6);





//        System.out.println(map.size());




//        showAllData( new Hashtable<Integer,Student> (map));
        getInfoByRollNo(new Hashtable<Integer , Student>(map));
//        editDepartment(new Hashtable<Integer, Student>(map));
//        showAllData( new Hashtable<Integer,Student> (map));
//        getInfoByRollNo(new Hashtable<Integer , Student>(map));

//        System.out.println(map.size());


//        Iterator<String> i = map.iterator();

//        hashFun(s1.getRollNo());


    }

    public static void getInfoByRollNo(Hashtable<Integer , Student> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll no you want to search : ");
        Integer rollNo = sc.nextInt();
        int indexxx = hashFunction(rollNo);

        int index = hashFunction(rollNo);
//        System.out.println(index);

//        if (map.get(index).getRollNo() == rollNo) {
//            System.out.println("Name: " + map.get(index).getName() + " \nRoll No:  " +
//                    map.get(index).getRollNo() + " \nDepartment:  " +
//                    map.get(index).getDepartment() + "  "
//            );
//    }
//     else System.out.println("Roll No not present in DataBase");

//        System.out.println("1st" + map.get(index).getRollNo().hashCode());
//        System.out.println("2nd"+rollNo.hashCode());

//            System.out.println(map.get(1).hashCode());
//            System.out.println("3rd "+map.get(index).hashCode());
//            System.out.println("4th "+map.get(indexxx).hashCode());
//            System.out.println(map.get(index).getRollNo());
//            System.out.println(rollNo);

//            System.out.println(map.get(index).hashCode() == map.get(indexxx).hashCode());  //
//            System.out.println(map.get(index).getRollNo() == rollNo);

            if (map.get(index).hashCode() == map.get(indexxx).hashCode() && map.get(index).getRollNo().equals(rollNo)) {
                System.out.println("Name: " + map.get(index).getName() + " \nRoll No:  " +
                        map.get(index).getRollNo() + " \nDepartment:  " +
                        map.get(index).getDepartment() + "  "
                );
            }
            else System.out.println("Roll No not present");
        }
    public static int hashFunction(Integer key)
    {
        Integer index= key%10;
        return index;
    }

    public static int hashFun(int key){
        int n =11;   // default size of Hashtable and 16 of HashMap ....if we initialize capacity then n is equal to that value
        int index = key & (n-1);

        String ke = "mangesh" ;
        int hash = ke.hashCode();

        int in = hash & (n-1);
        System.out.println(hash);
        System.out.println(in);

        return index;

    }

//    public static int hash(int key)
//    {
//        int index = hashFunction(key);
//        int r =0 ;
//        r+=key/10;
//        int rollNo = r*10+ index;
//        return rollNo;
//    }

    public static void showAllData(Hashtable<Integer , Student> map){

        System.out.println("\n\n");
        System.out.println("************ All Data present in Database ****************\n\n");
        System.out.println("Roll No"+"     "+"Name"+"     "+"Department");
        System.out.println();

        for (Map.Entry<Integer , Student> i : map.entrySet()){
            System.out.println(i.getValue().getRollNo()+"        "+i.getValue().getName()+"      "
                    +i.getValue().getDepartment());
            System.out.println();
        }

    }

    public static void editDepartment(Hashtable<Integer,Student> map){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter RollNo");
        int rollNo = sc.nextInt();
        String dep;
        int index = hashFunction(rollNo);
        if (map.get(index).getRollNo() == rollNo)
        {
            System.out.println("Enter Department");
            dep = sc.next();
            map.get(index).setDepartment(dep);
        }
        else {
            System.out.println("Roll No Not Present In Database, please enter Correct Roll no");
            editDepartment(new Hashtable<Integer,Student>(map));

        }

    }


 }


class Student{

    private Integer rollNo;
    private String name;
    private String department;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

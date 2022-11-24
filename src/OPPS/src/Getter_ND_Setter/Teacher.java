package OPPS.src.Getter_ND_Setter;

public class Teacher {

    public static void main(String[] args) {

        student obj = new student();
        obj.setAge(20);
        obj.setDepartment("CSE");
        obj.setRoll_no(11);
        obj.setName("Mangesh");

        System.out.println(obj.getName()+"\n"+obj.getAge()+"\n"+obj.getDepartment()+"\n"+obj.getRoll_no());


    }

}

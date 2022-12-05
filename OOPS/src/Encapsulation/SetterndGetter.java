package Encapsulation;



class Encapsulation{

     private String name;
     private String city;
     private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SetterndGetter {
    public static void main(String[] args) {


        Encapsulation en = new Encapsulation();

        en.setAge(67);
        en.setCity("Nagpur");
        en.setName("Mangesh");

        System.out.println(en.getName()+" "+en.getAge()+" "+en.getCity());


    }



}

/**


   * HashMap


 *
 */




package HashMap;


import java.time.LocalDate;
import java.util.*;

class PersonDetails{


    private String fullName;
    private LocalDate dateOfBirth;
    private String address;


    public PersonDetails(String fullName, LocalDate dateOfBirth, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString()
    {

        return "Name : "+fullName+"\nDate Of Birth :  "+dateOfBirth+"\nAddress : "+address;
    }
}

public class AdharCard {


    public static void main(String[] args) {



        PersonDetails p1 = new PersonDetails
                ("Rakesh Prabhakar Pawar" ,LocalDate.of(1998,05,19),"Vansadi");


        PersonDetails p2 = new PersonDetails
                ("Mangesh Bala Dhande" ,LocalDate.now(),"Nirli");


        PersonDetails p3 = new PersonDetails
                ("Ankit Naitam" ,LocalDate.of(1999,07,8),"Gadchiroli");


        HashMap hashMap = new HashMap();

        hashMap.put(755800373925L , p1);
        hashMap.put(755800373926L , p2);
        hashMap.put(755800373927L , p3);

        System.out.println(hashMap);

        AdharCard adharCard = new AdharCard();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n\n************");
            System.out.println("1.getAllAdharDetails");
            System.out.println("2.getPersonalAdharDetails");
            System.out.println("3. Exit");

            System.out.println("\nSelect Your Choice");
            int choice = scanner.nextInt();
                switch (choice) {

                    case 1:
                        adharCard.getAllAdharDetails(hashMap);
                        break;

                    case 2:
                        adharCard.getPersonalAdharDetails(hashMap);
                        break;

                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("You Enter Wrong Choice");

                }
        }

    }


    public void getAllAdharDetails(HashMap hashMap){


        Collection collection = hashMap.entrySet();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {

            Map.Entry entry = (Map.Entry) iterator.next();
            // Entry is Interface inside a Map Interface
            // when we have to call Interface which inside the another Interface then we have to use .
            // OuterInterface.innerInterface

            System.out.println("\n\n***********");
            System.out.println("Adhar No : " + entry.getKey());
            System.out.println(entry.getValue());


        }
    }

    public void getPersonalAdharDetails(HashMap hashMap) {


//        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Adhar No");

        Long adharCardNo = scanner.nextLong();

        Collection collection = hashMap.entrySet();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {

            Map.Entry entry = (Map.Entry) iterator.next();
            // Entry is Interface inside a Map Interface
            // when we have to call Interface which inside the another Interface then we have to use .
            // OuterInterface.innerInterface

            if (entry.getKey().equals(adharCardNo)) {
                System.out.println("\n\n***********");
                System.out.println("Adhar No : " + entry.getKey());
                System.out.println(entry.getValue());
//                flag=true;
                System.exit(0);  // exit the entire program....not best
            }
        }
        System.out.println("Your Adhar card Not generated or You Entered Wrong Adhar No");
//        if (flag == false)
//        {
//            System.out.println("Your Adhar card Not generated or You Entered Wrong Adhar No");
//        }




    }
}

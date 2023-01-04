package SerializationandDeSerialization.Basic;


import java.io.*;

class College1 implements Serializable {

    String collegeName = "GEC Chandrapur";
    Integer collegeCode = 442956;

    transient Long yearlyIncome = 100000000l;

}
class College2 implements Serializable{

    String collegeName = "Rajiv Gandhi Chandrapur";
    Integer collegeCode = 4426;

    transient Long yearlyIncome = 40000000l;

}
class College3 implements Serializable{

    String collegeName = "BIT Chandrapur";
    Integer collegeCode = 44346;

    transient Long yearlyIncome = 3000000l;

}

public class LaunchThird {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        College1 college1 = new College1();
        College2 college2 = new College2();
        College3 college3 = new College3();

        System.out.println("Serialization Started........................");

        String fileName = "Hey.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(college1);
        objectOutputStream.writeObject(college2);
        objectOutputStream.writeObject(college3);

        System.out.println("Serialization Ended....................");



        System.in.read();

        System.out.println();


        System.out.println("De-Serialization Started....................");

        FileInputStream fileInputStream = new FileInputStream(fileName);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//        College1 college111 = (College1) objectInputStream.readObject();
//
//
//        System.out.println("College Name :: " + college111.collegeName);
//        System.out.println("College code :: " + college111.collegeCode);
//        System.out.println("College Yearly Income :: " + college111.yearlyIncome);





//        String s = "hello";
//
//        System.out.println(s instanceof String);


         Object object = objectInputStream.readObject();


         try {
             while (object != null) {

//             System.out.println(object);
                 if (object instanceof College1) {
                     System.out.println("\n\n######  College First  ######");

                     College1 college11 = (College1) object;
                     String collegeName = college11.collegeName;
                     Integer collegeCode = college11.collegeCode;
                     Long yearlyIncome = college11.yearlyIncome;

                     System.out.println("College Name :: " + collegeName);
                     System.out.println("College code :: " + collegeCode);
                     System.out.println("College Yearly Income :: " + yearlyIncome);

                 }
                 if (object instanceof College2) {
                     System.out.println("\n\n######  College Second  ######");
                     College2 college22 = (College2) object;
                     String collegeName = college22.collegeName;
                     Integer collegeCode = college22.collegeCode;
                     Long yearlyIncome = college22.yearlyIncome;

                     System.out.println("College Name :: " + collegeName);
                     System.out.println("College code :: " + collegeCode);
                     System.out.println("College Yearly Income :: " + yearlyIncome);

                 }
                 if (object instanceof College3) {
                     System.out.println("\n\n######  College Third  ######");
                     College3 college33 = (College3) object;
                     String collegeName = college33.collegeName;
                     Integer collegeCode = college33.collegeCode;
                     Long yearlyIncome = college33.yearlyIncome;

                     System.out.println("College Name :: " + collegeName);
                     System.out.println("College code :: " + collegeCode);
                     System.out.println("College Yearly Income :: " + yearlyIncome);
                 }

                 object = objectInputStream.readObject();
             }
         }catch (IOException ioexception){

             ioexception.getStackTrace();
         }

        System.out.println("\n\nDe-Serialization Ended....................");

    }

}

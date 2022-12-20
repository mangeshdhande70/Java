/**


 * We can use enum to define a group of named constants.

 * Enum concept introduced in 1.5 versions.

 *  When compared with old languages enum java's enum is more powerful.

 *  By using enum we can define our own data types which are also come enumerated data types.

 * for each Class , for every and for every enum there is separate .class file will be generated.


 example-

  enum Gender {

         MALE,  ----------> internally ----> public static final Gender MALE = new Gender();
         FEMALE, ---------> internally ----> public static final Gender FEMALE = new Gender();
         OTHERS ----------> internally ----> public static final Gender OTHER = new Gender();

          // You can also declare
           1. Fields ----> instance variable or properties.
           2. Methods
           3. Constructor.



 }



    Internal implementation of enum:
 -------------------------------------------------------------------

 * Internally enum's are implemented by using class concept.

 * for every time whenever you create enum internal class will be generated.

 * Every enum constant is a reference variable to that enum type object.

 * Every enum constant is implicitly public static final always.



 */


package LaunchFirst;

enum Result {

    PASS , FAIL, RN;  // public static final  (PASS is Value and PASS is reference Variable.)

//    final static int a = 10;  you can declare.



    // public static final LaunchFirst.Result PASS = new LaunchFirst.Result();
    //public static final Result FAIL = new Result();
    // JVM will internally create Result class & Empty Constructor.

}

enum Gender{

    MALE , FEMALE , OTHER;

    static int a = 20;

}


public class Students {


    public static void main(String[] args) {


        Result result = Result.PASS;
        System.out.println(result);

//        int value = Result.a;
//        System.out.println(value);


        System.out.println(Gender.OTHER);



        Result result1 [] = Result.values();  // internal call generated hence , we can use methods.

        for (Result arrOfResult :result1) {

            System.out.println(arrOfResult.ordinal()+" : "+arrOfResult.name());
            // ordinal give index of values.

        }

    }

}

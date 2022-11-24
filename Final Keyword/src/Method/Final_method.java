/**


 Final method Participate in Inheritance but It can't be Overridden.


 */


package Method;



class Stud1 {

    public void College_name(){

        System.out.println("GEC");
    }

    final public void pass(){
        String pass = "Mangesh123";
        System.out.println(pass);
    }
}

class Stud2 extends Stud1{

    public void College_name()
    {
        System.out.println("GEC Chandrapur");
    }

//    public void pass(){
//        System.out.println("password is"+ "Mangesh000" );  // here pass is printed different to stop that
//                                                          // we create pass method as a final to stop overridden
//    }
//

}


public class Final_method {

    public static void main(String[] args) {

        Stud2 obj = new Stud2();
        obj.College_name();
        obj.pass();

    }

}

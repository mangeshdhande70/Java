/**

 Annotation
 ____________________________________________________________________________________________

 Define :-

           * It is used to adding extra information to our code, for compiler, JVM, WebBrowser,
             WebContainer.

           * To give the message to the Compiler, JVM, Browser.



 --------------

  Parent of all annotation is ---> Annotation


     1. Built in Annotation & 2. Custom Annotation will be Possible.

  You can apply Annotations to

    1.Class , 2.Method , 3.Constructor , 4.Field
    5.Local Variable , 6.Parameter , 7.enum , 8.interface



  Marker Value Annotation --> No Value inside Annotation Interface (@interface{})
  Single Value Annotation --> only one value inside Annotation Interface (@interface{ String value;}
  Multiple Value Annotation -->  more than one value inside Annotation Interface.



  Target --> the Annotation is for what purpose for method or class or interface ....etc.

  Retention --> Whatever we are creating should have power to reached to JVM, Code , Compiler...etc.








 */







package CustomeAnnotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// for Instance Variable and another Annotation (MetaAnnotation)
@Target({ ElementType.FIELD,ElementType.ANNOTATION_TYPE } )
@Retention(RetentionPolicy.RUNTIME) // only one allowed not multiple
@interface BookInfo{

    String name() default "India Positive";
    int noOfSelling() default 200;

}


class Book{

    @BookInfo
    private String authorName;
    private String bookType;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}








@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // Power to provide extra information to JVM
@interface FootBallPlayer{

    String countryName() default "Argentina" ;
    int noOfGoals() default 600;

}

@FootBallPlayer(countryName = "France" , noOfGoals = 700)
class FootBall{

    private String name;
    private int noOfGames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfGames() {
        return noOfGames;
    }

    public void setNoOfGames(int noOfGames) {
        this.noOfGames = noOfGames;
    }
}




// For both Class and Method
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE) // work as comment ... ignoring by Compiler
//@Retention(RetentionPolicy.RUNTIME) not applicable multiple
@interface CricketPlayer
{
    String countryName();
    int runs();
}

/**
  if you are not specified fields inside annotation interface then it is mandatory to give
  while you annotating this annotation interface

 */
@CricketPlayer(countryName = "India" , runs = 80000)
class CricketPlayers{

    private String nameOfPlayer;

    private int innings;

    @CricketPlayer(countryName = "India" , runs = 80000)
    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}



public class LaunchFirst {

    public static void main(String[] args) {


        FootBall footBall = new FootBall();
        footBall.setName("Messi");
        String name = footBall.getName();
        System.out.println(name);


    }


}

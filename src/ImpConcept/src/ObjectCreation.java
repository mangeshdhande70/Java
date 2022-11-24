/**

 que :: -  can we create Object using reference

 */



class D{

    public void m1()
    {
        System.out.println("Inside D in m1()");
    }

}

class E extends D{

    public void m2()
    {
        System.out.println("Inside E in m2()");
    }

}

public class ObjectCreation {

    public static void main(String[] args) {

        D obj = new D();

        System.out.println("Using parent reference and Parent casting");
        D obj1 = (D) obj;

        obj1.m1();

      System.out.println("Parent reference but casted to Child");
        D obj3 = (E) obj;

        obj3.m1();


        E obj4 = new E();


        System.out.println("Child Reference");
        E obj5 = (E) obj4;
        obj5.m2();
        obj5.m1();


    }



}

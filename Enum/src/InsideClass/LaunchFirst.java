package InsideClass;



public class LaunchFirst {

    enum Month{

        JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEP, OCT, NOV, DEC;


    }

    public static void main(String[] args) {

        System.out.println(Month.JAN);

        Month obj[] =Month.values();

        for (Month arrOfMonth:obj)
            System.out.println(arrOfMonth.ordinal() +" : "+arrOfMonth.name());



    }

}

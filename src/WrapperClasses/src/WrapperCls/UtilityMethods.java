package WrapperClasses.src.WrapperCls;

import javax.swing.text.StyledEditorKit;

public class UtilityMethods {


    public static void main(String[] args) {

        System.out.println("**** valueOf () *****");

        Integer i1 = Integer.valueOf(10);
        System.out.println("i1 = " +i1);

        Integer i2 = Integer.valueOf("20");
        System.out.println("i2 = " +i2);


//        Integer i3 = Integer.valueOf("10.5");  -- NumberFormatException
//        System.out.println(i3);

//        Integer i4 = Integer.valueOf(10.5);  -- CE


//        Integer i3 = Integer.valueOf("sachin");  -- NumberFormatException
//        System.out.println(i3);

        Float f1 = Float.valueOf(10.5f);
        System.out.println("f1 = " +f1);

        Float f2 = Float.valueOf("10.5");
        System.out.println("f2 = " +f2);

        Character c1 = Character.valueOf('c');
        System.out.println("c1 = " +c1);

//        Character c2 = Character.valueOf("c"); -- CE

        Boolean b1 = Boolean.valueOf(true);
        System.out.println("b1 = " +b1);

        Boolean b2 = Boolean.valueOf("true");
        System.out.println("b2 = " +b2);

        Boolean b3 = Boolean.valueOf("False");
        System.out.println("b3 = " +b3);

        Boolean b4 = Boolean.valueOf("True");
        System.out.println("b4 = " +b4);

        Boolean b5 = Boolean.valueOf(false);
        System.out.println("b5 = " +b5);

        Boolean b6 = Boolean.valueOf("tRue");
        System.out.println("b6 = "+b6);
//
//        Boolean b6 = Boolean.valueOf(False); -- CE
//        System.out.println(b6);
//


        System.out.println("***** xxxValue() *****");

        /**

         WrapperClass wrapperVariable = new WrapperClass(Data) - int,char,boolean,float..

         dataType variable =  wrapperVariable.xxxValue();


         */

        Integer i = new Integer(10);
        int k1 = i.intValue();
        System.out.println(k1);


        Character cc = new Character('c');
        char c = cc.charValue();
        System.out.println(c);

        Boolean bb = new Boolean("true");
        boolean bc = bb.booleanValue();
        System.out.println(bc);

        Float ff = new Float(10.9);
        double d1 = ff.doubleValue();
        System.out.println(d1);
        int d2 = ff.intValue();
        System.out.println(d2);

        Double d3 = new Double(10.8);
        float f4 = d3.floatValue();
        System.out.println(f4);



        System.out.println("***** parseXXX *****");

        /**

         dataType i = WrapperClass.parseXXX(String);

         */


        String s1 = "10";

        int p1 = Integer.parseInt(s1);
        System.out.println(p1);

//        String s2 = "Akssh";
//        int p2 = Integer.parseInt(s2);  -- NumberFormatException

          String s3 = "10.5";
//        Integer p3 = Integer.parseInt(s3);  -- NumberFormatException
//        System.out.println("p3 = " +p3);

//        int p4 = Integer.parseInt(s3);   -- .NumberFormatException
//        System.out.println("p4 = " +p4);

        float f3 = Float.parseFloat(s3);
        System.out.println("f3 = " +f3);

        Double d4 = Double.parseDouble(s3);
        System.out.println("d4 = "+d4);

        boolean b7 = Boolean.parseBoolean(s3);
        System.out.println("b7 = "+b7);

        int ii =Integer.parseInt("1111",2);
        System.out.println("ii = "+ii);

        int ii1 = Integer.parseInt("1011",2);
        System.out.println("ii1 = "+ii1);

        double d = Double.parseDouble("10.5");
        System.out.println("d = "+d);

        double dd = Double.parseDouble("10");
        System.out.println("dd = "+dd);

        double dd1 = Float.parseFloat("10.5");
        System.out.println("dd1 = "+dd1);

//        double dd12 = Float.parseFloat(10.5);  -- Only String argument

//        double dd2 = Double.parseDouble("ten"); -- NumberFormatException
//        System.out.println(dd2);


        /**


         public static primitive parseXXX(String s , int radix)
                                                   - Range -- range is from 2 to 36


         Every Integral type Wrapper class(Byte,Short,Integer,Long) contains the following parseXXXX()
         to convert Specified radix String to primitive type.


         */


        int int1 = Integer.parseInt("111",2);
        System.out.println("int1 = "+int1);

//        boolean bb2 = Boolean.parseBoolean("111",2);
//        System.out.println("int1 = "+int1);


        /**


         toString()
         =========
         To convert the Wrapper Object or primitive to String.
         Every Wrapper class contain toString()


         1. Every wrapper class (including Character class) contains the above toString()
         method to convert wrapper object to String.
         2. It is the overriding version of Object class toString() method.
         3. Whenever we are trying to print wrapper object reference internally this
         toString() method only executed


         */


        System.out.println("***** toString() *****");

        Integer k3 = 10;
        String s5 = k3.toString();
        System.out.println(s5);

        Character c9 = 'c';
        String s6 = c9.toString();
        System.out.println(s6);


        String ss1=Integer.toString(10);
        String ss2=Boolean.toString(true);
        String ss3=Character.toString('a');

        System.out.println("ss1 = "+ss1);
        System.out.println("ss2 = "+ss2);
        System.out.println("ss3 = "+ss3);


        /**

         form3
         =====
         Integer and Long classes contains the following static toString() method to convert the
         primitive to specified radix String form.

         public static String toString(primitive p,int radix)
                                                      |=> 2 to 36


         */


        String sss=Integer.toString(15,2);
        System.out.println("sss = "+sss); // 1111


    }


}

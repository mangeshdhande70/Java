package WrapperClasses.src.WrapperCls;

public class ConstructorCalling {

    public static void main(String[] args) {

        System.out.println("***** Boolean *****");

        Boolean b1 = new Boolean("tRue");
        System.out.println(b1);

        Boolean b11 = new Boolean("tRue");
        System.out.println(b11);

        Boolean b2 = new Boolean(true);
        System.out.println(b2);

        Boolean b3 = new Boolean("FALSE");
        System.out.println(b3);

        Boolean b4 = new Boolean(false);
        System.out.println(b4);

        Boolean b5 = new Boolean("Sachin");
        System.out.println(b5);

        Boolean b6 = new Boolean("TRUE");
        System.out.println(b6);


        System.out.println("******  Float   *********");
        Float f1 = new Float("2.0");
        System.out.println(f1);

        Float f2 = new Float(2.0f);
        System.out.println(f2);

        Float f3 = new Float("2.0f");
        System.out.println(f3);

        Float f4 = new Float(2.0);
        System.out.println(f4);


        System.out.println("****** Character *****");

        Character c = new Character('c');
        System.out.println(c);

//        Character ch  = new Character("c"); // CE
//        System.out.println(ch);



        String c1 = "A";
        String c2 = "a";

//        System.out.println(c1.charAt(0) > c2.charAt(0));
//




    }



}

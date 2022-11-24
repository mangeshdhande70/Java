package String.src.LengthOfString;

public class patternMatching {
    public static void main(String[] args) {

        String str = "hey! Dude, where are you now";

        String ptrn = "ere";
        String ptrn1 = "man";
        String ptrn2 = "u now";
        String ptrn3 = "re re";

        boolean res1 = str.contains(ptrn);
        boolean res2 = str.contains(ptrn1);
        boolean res3 = str.contains(ptrn2);
        boolean res4 = str.contains(ptrn3);

        if (res1)
            System.out.println("Pattern FOund");
        else
            System.out.println("Pattern Not Found");


        if (res2)
            System.out.println("Pattern FOund");
        else
            System.out.println("Pattern Not Found");

        if (res3)
            System.out.println("Pattern FOund");
        else
            System.out.println("Pattern Not Found");

        if (res4)
            System.out.println("Pattern FOund");
        else
            System.out.println("Pattern Not Found");

    }
}

package String;

public class Split_method {
    public static void main(String[] args) {
        String str = "Mangesh,Rakesh,Ankit,Vivek,Dhiraj";

        System.out.println(str);

        String [] str1 = str.split(",");
        System.out.println(str1[0]);
        System.out.println(str1);

        for(String var : str1){
            System.out.print(var+" ");
        }



    }
}

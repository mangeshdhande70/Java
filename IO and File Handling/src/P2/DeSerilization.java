package P2;

public class DeSerilization {

    public static void main(String[] args) {


        try {
            Class.forName("P1.Serialization");
            System.out.println("class load and Register");
        }catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }


    }

}

package String;

interface GLS{

    void gls(String s);

}



public class UsingInner {


    public static void main(String[] args) {


        GLS g = new GLS() {
            @Override
            public void gls(String s) {
                System.out.println(s.length());
            }
        };

        g.gls("Satish");

    }


}

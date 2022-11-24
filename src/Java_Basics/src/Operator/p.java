package Operator;


class X {
    int a;
    double b;

}
class Y extends X{
    int c;
}
public class p {
    public static void main(String[] args) {
//        byte a = 64;
//        int x;
//        byte b;
//        x = a << 2;
//        b = (byte) (a << 2);
//        System.out.println(x+" "+b);

        X a= new X();
        Y b = new Y();

        Class obj;
        obj = a.getClass();
        System.out.println(obj.getName());

    }
}

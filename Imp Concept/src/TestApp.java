/**
 que :: Can we make our userdefined class as Immutable?
 ans. yes possible as shown below

 */


final class Test{

    int a;
    Test(int a)
    {
        this.a = a;
    }
    public Test modify(int a)
    {
        if (this.a == a)
            return this;
        else return new Test(a);
    }
}
public class TestApp {

    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = t1.modify(10);
        System.out.println(t1 == t2);


        Test t3 = new Test(100);
        Test t4 = t3.modify(20);
        System.out.println(t3 == t4);
        System.out.println(t3.equals(t4));

    }

}

package Basic;

@FunctionalInterface
interface Demo{

    void method(int a,int b);

}


@FunctionalInterface
interface Demo2{

    float sub(int x,int y);
}

@FunctionalInterface
interface Demo3{

    void display();
}

@FunctionalInterface
interface Demo4{

    void mul(int a,float b);
}

public class Lambda {

    public static void main(String[] args) {

        Demo demo = (a,b)-> System.out.println(" "+a+b);
        demo.method(4,5);


        Demo2 d2 =  (a,b) -> a-b;
        System.out.println(d2.sub(45,15));

        Demo3 d3 = () -> System.out.println("Mangesh");
        d3.display();


        Demo4 d4 = (x,y) -> {  // if there are multiple line & explicitly
                               // return statement then  use Curley braces
            double res = x*y;
            System.out.println(res);
        }; // compulsory

        d4.mul(4,5);
    }
}

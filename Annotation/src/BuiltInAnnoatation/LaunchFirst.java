package BuiltInAnnoatation;


@FunctionalInterface
interface Launch{

    void method();

//    int display();

}


interface Parent{

    int display(int c);
}


public class LaunchFirst  {

    public static void main(String[] args) {

        Launch launch = () -> {
            System.out.println("Hello");
        };
        launch.method();


        Parent parent = c -> c;
       System.out.println("Parent c = "+parent.display(67));
    }





}

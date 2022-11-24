package Loading.ExplicetelyLoading;


class Students{

    static{
        System.out.println(".class file loaded of Student class");
    }

    Students(){
        System.out.println("Student constructor is called");
    }

}


public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


        String className = args[0];  // taking className from Console

        Class c = Class.forName(className);

        Object obj = c.newInstance();



    }



}

/**


 Lambda expression for method reference to a constructor of a class is:

 (args) -> new ClassName(args)
 The above lambda expression can get replaced by a method reference. The shorthand code looks like this:

 ClassName::new



 */



package ConstructorReference.pckg1;

public class LaunchFirst {


    public static void main(String[] args) {



        Demo demo = (String str , Integer id )-> new Sample(str, id);
        demo.display("Ketan" , 897);


        System.out.println();

        // same logic using Constructor reference as above ( line 26 and 27 )
        // Constructor parameter of Sample class need to same as Interface method para.
        // creating Object of Sample Class by giving demo1 reference (Interface Reference)
        Demo demo1 = Sample::new;

        demo1.display("Akash" , 123);




    }


}

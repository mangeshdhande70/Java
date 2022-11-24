package WrapperCls;

/**

 Automatic conversion of primitive type to wrapper object by the compiler is called "AutoBoxing".
 Integer i1 = 10;
 |
 |After compilation the code would be
 |
 |
 Integer i1 = Integer.valueOf(10);



 Note: Autoboxing is done by the compiler using a method called "valueOf()".

 AutoUnBoxing
 ============
 Automatic conversion of wrapper object to primtive type by compiler is called "AutoUnBoxing".

 Integer i1 = new Integer(10);
 int i2 = i1;
     |
     |compiler converts Integer to int type using intValue()
     |
 int i2 = i1.intValue();


 */








public class AutoBoxing {


    public static void main(String[] args) {


        Integer i = 10;  // --- AutoBoxing




    }


}

/**

 Final variable --> make variable constant, we can't modify that variable which declare as final.
                    it's compile time constant.

 */

package Variable;

public class Final_variable {

    public static void main(String[] args) {

        float pi = 3.14f;

        pi = 9.8f;  // this change the value of pi and it's not possible in real world to resolve this issue
                   // we create variable as final

        System.out.println(pi);


        final float pi1 = 3.14f;
        // pi1 = 9.8f;  it is not possible to modify the value of final variable
    }
}

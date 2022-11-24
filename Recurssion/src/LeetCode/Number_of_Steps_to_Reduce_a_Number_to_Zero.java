package LeetCode;

/**
 *
 */

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {


    public static void main(String[] args) {

//             int n = numberOfSteps(8);
             System.out.println(numberOfSteps(123));

    }

    static int numberOfSteps(int num)
    {
        return helper(num,0);
    }

    static int helper(int num,int count){
        if (num==0) {
            return count;
        }
        if ((num&1)==1 ) {
            return helper(--num, count + 1);
        }
        else {
            num = num/2;
            return helper(num,count+1);
        }
    }


}

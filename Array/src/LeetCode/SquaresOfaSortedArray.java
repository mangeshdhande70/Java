package LeetCode;

import java.util.Arrays;

public class SquaresOfaSortedArray {

    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};

        for (int i = 0; i < nums.length ; i++) {
            Math.abs(nums[i]);
            nums[i]*=nums[i];
        }
        for (int a: nums) {
            System.out.print(a+" ");
        }

        System.out.println();
        Arrays.sort(nums);
        for (int a: nums) {
            System.out.print(a+" ");
        }





    }


}

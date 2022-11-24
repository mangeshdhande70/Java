package Arrays;

import java.util.Arrays;

public class ranges_Missinf {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int miss = missingNumber(nums);
        System.out.println(miss);


    }
    public static int missingNumber(int[] nums)
    {
        boolean contain_zero = false;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0){
                contain_zero = true;
                break;
            }
        }
        if (!contain_zero) return 0;
        Arrays.sort(nums);
        for (int j : nums)
            System.out.print(j+" ");
        System.out.println();
        int i=0;
        if (nums.length == 1 && nums[i]==0)
            return 1;
        if (nums.length == 1)
            return nums[i] -1 ;

        while ( i < nums.length-1)
        {
            if (nums[i] == nums[i+1])
                i++;
            else if (nums[i]+1 != nums[i+1])
                return nums[i]+1;
            else
                i++;
        }
        return nums[i]+1;
    }
}


/*
aletrnate


class Solution{
    public int missingNumber(int[] nums){
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        return (0+nums.length)*(nums.length+1)/2 - sum;
    }
}
 */
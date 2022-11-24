package QP.src.Arrays;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {-1};
        int singlNum = singlNum(nums);

        System.out.println(singlNum);

    }

    public static int singlNum(int[] nums)
    {
       int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans^=nums[i];
        }
        return ans;
    }
}

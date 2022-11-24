package Arrays;

import java.util.Arrays;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1,2};

        int ans = firstEl(nums);

        System.out.println();
        if (ans== 1)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println(ans);
        }

    }
    public static int firstEl(int[] nums)
    {
        int j = 0;
        boolean contain_one= false;

       for (int o : nums){
           if (o == 1)
           {
               contain_one = true;
               break;
           }
       }
       if (!contain_one) return 1;

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] <= 0 || nums[i] > nums.length) nums[i] = 1;
        }

        Arrays.sort(nums);
        for (int k : nums)
            System.out.print(k + " ");

       while (j < nums.length - 1) {
                if (nums[j] == nums[j+1])
                {
                    j++;
                }
                else if (nums[j] + 1 != nums[j + 1]) {
                    return nums[j] + 1;
                }
                else {
                    j++;
                }
            }
            return nums[j] + 1;

    }
}

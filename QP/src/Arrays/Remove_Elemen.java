package Arrays;

public class Remove_Elemen {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int len = length(nums , 2);
        System.out.println(len);
        for (int i : nums)
        {
            System.out.print(i+ " ");
        }
        System.out.println();

        int[] nums2 = {3,2,2,3};
        int l = length(nums2 , 3);
        System.out.println(l);
        for (int i : nums2)
        {
            System.out.print(i+ " ");
        }

        System.out.println();
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int len1 = remove(nums1 , 2);
        System.out.println(len1);

    }
    public static int length(int[] arr , int val)
    {
        int[] newArr = new int[arr.length];
        int k = 0,count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != val)
            {
                newArr[k++] = arr[i];

            }
            else {
                count++;
            }
        }
        int l = 0;
        for (int i = 0; i < newArr.length; i++) {
            arr[l++] = newArr[i];
        }

      int ans = arr.length - count;
      return ans;
    }

    // method 2
    public static int remove(int[] nums,int val)
    {
        int s=0;
        for (int i = 0; i < nums.length; i++) {
             if (nums[i] != val)
             {
                 nums[s++] = nums[i];
             }
        }
        return s;
    }

}

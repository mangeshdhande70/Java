/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */


package QP.src.Arrays;

public class Median_of_two_sorted_Arrays {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {};
        double median = merg(nums1,nums2);
        System.out.println(median);

//        int [] nums3 = {3,4};
//        double m = merg(nums1 , nums3);
//        System.out.println(m);
    }

    public static double merg(int[] nums1 , int[] nums2)
    {

        int i=0;
        int j=0;
        int k=0;
        int mix[] = new int[nums1.length+nums2.length];

        while (i<nums1.length && j<nums2.length)
        {
            if (nums1[i] < nums2[j])
            {
                mix[k++] = nums1[i++];
            }
            else {
                mix[k++] = nums2[j++];
            }
        }
        while (i < nums1.length)
        {
            mix[k++] = nums1[i++];

        }
        while (j < nums2.length)
        {
            mix[k++] = nums2[j++];
        }
//
//        System.out.println(mix.length);

        if (mix.length == 1)
            return mix[0];
        if (mix.length == 2)
            return (mix[0]+mix[1])/2.0;

       int mid = mix.length/2;
        System.out.println("mid "+mid);
        if ((mix.length&1) == 1){
            return mix[mid];
        }
        return (mix[mid]+mix[mid-1])/2.0;

    }
}

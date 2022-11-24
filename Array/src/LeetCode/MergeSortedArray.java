package LeetCode;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {2, 0};
        int m = 3, n = 3;
        int[] nums2 = {1};

        int[] newArr = new int[nums1.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == 0)
                i++;
            else if (nums1[i] < nums2[j])
                newArr[k++] = nums1[i++];
            else
                newArr[k++] = nums2[j++];
        }

        while (i < nums1.length) {
            if (nums1[i] == 0)
                i++;
            else
                newArr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            if (nums2[j] == 0)
                j++;
            else newArr[k++] = nums2[j++];
        }


        for (int l = 0; l < newArr.length; l++) {
            nums1[l] = newArr[l];
        }

        for (int a : nums1)
            System.out.print(a + " ");


        String s = "III";
        int sum = 0;
        for (int l = 0; l < s.length(); l++) {
            if (s.charAt(l) == 'I') {
                sum += 1;
            }


        }
    }

}
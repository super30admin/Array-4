// Time Complexity : O(n), where n = length of the array
// Space Complexity : O(1), only a few integer variables are used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach :
//   - Traverse the array from the end to find the first pair 'i' such that nums[i] < nums[i+1].
//   - This is the "breach" point where order breaks from the back. If no such point is found, the array is in descending order.
//   - If breach exists, find the smallest number just larger than nums[i] from the right end and swap them.
//   - Finally, reverse the subarray after index 'i' to get the next lexicographical permutation.

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //identify breach
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        if(i >= 0) {
            //identify just bigger digit than breach
            int j = n - 1;
            while(nums[j] <= nums[i])   j--;
            swap(nums, i, j); //i is breach index and j is just higher digit index
        }

        reverse(nums, i + 1, n - 1);

    }

    private void reverse(int[] nums, int l, int r) {
        while(l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        NextPermutation solver = new NextPermutation();

        int[] nums1 = {1, 2, 3};
        System.out.println("Original: " + Arrays.toString(nums1));
        solver.nextPermutation(nums1);
        System.out.println("Next Permutation: " + Arrays.toString(nums1)); // Expected: [1, 3, 2]

        int[] nums2 = {3, 2, 1};
        System.out.println("Original: " + Arrays.toString(nums2));
        solver.nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2)); // Expected: [1, 2, 3]
    }
}

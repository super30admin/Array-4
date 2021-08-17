package Array4;

public class MaximumSubarray {
    /* Created by palak on 8/13/2021 */

    /**
     Running Sum Problem:
     Check if the number itself is better or the running sum is better.

     Time Complexity: O(n)
     Space Complexity: O(1)
     */
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rSum = nums[0];
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum, max);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}

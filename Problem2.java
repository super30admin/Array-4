/*
Maximum Subarray
approach: at each element check if adding gives max sum or just that element
time: O(n)
space: O(1)
 */
public class Problem2 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], currMax = nums[0];

        for(int i=1;i<nums.length;i++) {
            currMax = Math.max(currMax+nums[i], nums[i]);
            max = Math.max(currMax, max);
        }

        return max;
    }
}

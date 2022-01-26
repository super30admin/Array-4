// Time Complexity: O(n)
// Space Complexity: O(1)
// Kadane Algorithm
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int currMax = nums[0], max = nums[0];
        for(int i = 1; i < nums.length ;i++)
        {
            currMax = Math.max(currMax + nums[i], nums[i]);
            max = Math.max(max, currMax);
        }
        
        return max;
    }
}

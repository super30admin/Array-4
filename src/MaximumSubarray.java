// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int curr = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length;i++){
            curr = Math.max(curr + nums[i], nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }
}

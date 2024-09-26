// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;

        int n = nums.length;
        int runningSum = 0, globalMax = Integer.MIN_VALUE;

        for(int i=0; i < n; i++) {
        	runningSum = Math.max(runningSum + nums[i], nums[i]);
        	globalMax = Math.max(globalMax, runningSum);
        }

        return globalMax;
    }
}
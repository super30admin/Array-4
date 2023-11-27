// Time Complexity:  O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        for(int i=0; i<nums.length; i++) {
            localMax = Math.max(nums[i], nums[i]+localMax);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}

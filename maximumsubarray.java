# Time complexity:O(n)
# Space complexity: 0(1)
# Did code run successfully on leetcode: yes
# Any problem you faced: No








class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int resultsum = 0;
        int globalMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            resultsum = Math.max(resultsum + nums[i], nums[i]);
            globalMax = Math.max(globalMax, resultsum);
        }

        return globalMax;

    }
}
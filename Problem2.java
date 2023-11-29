//Time Complexity : O(n)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            max = Math.max(max, currentSum);
        }
        return max;
    }
}

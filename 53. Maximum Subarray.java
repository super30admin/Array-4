// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: YES
// Any problem you faced while coding this: NO

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int rSum = nums[0];
        int max = nums[0];
        int currStart = 0;
        int start = 0, end = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > rSum + nums[i]){
                start = end = i;
                rSum = nums[i];
            }
            else{
                rSum = rSum + nums[i];
                end = i;
            }
            if(rSum > max){
                start = currStart;
                end = i;
                max = rSum;
            }
            max = Math.max(max, rSum);
        }
        return max;
    }
}
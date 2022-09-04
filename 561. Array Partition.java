// Time Complexity: O(N LOG N)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: YES
// Any problem you faced while coding this: NO

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i + 2){
            sum += nums[i];
        }
        
        return sum;
    }
}S
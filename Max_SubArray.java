// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {
        int localSum = nums[0];
        int globalSum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            localSum = Math.max(localSum + nums[i], nums[i]);
            globalSum = Math.max(globalSum, localSum);
        }
            
        return globalSum;
    }
}
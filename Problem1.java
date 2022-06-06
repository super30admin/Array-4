// Time Complexity : O(n) where n is the size of input array
// Space Complexity : O(log n) where n is the size of input array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int max = 0;
        
        for(int i = 0; i < nums.length; i += 2) {
            max += nums[i];
        }
        
        return max;
    }
}
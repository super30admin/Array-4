// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
// Sorting and adding just the fist element of the pair
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        Arrays.sort(nums);
        int curr_sum = 0;
        
        for(int i=0; i<nums.length-1; i+= 2){
            curr_sum += nums[i];
        }
        
        return curr_sum;
    }
}
// Time Complexity : O(n log n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// sort the array pick the next greatest element to pair, to maximize sum of mins 

class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int result = 0;
        for(int i=0; i<nums.length; i+=2){
            result += nums[i];
        }
        
        return result;
    }
}
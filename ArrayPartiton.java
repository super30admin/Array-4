
// Time Complexity :O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int out = 0;
        for(int i = 0; i <nums.length;i=i+2)
        {
            out+=nums[i];
        }
        return out;
    }
}
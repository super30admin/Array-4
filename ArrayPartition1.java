//https://leetcode.com/problems/array-partition-i/submissions/
// Time Complexity :O(nlogn)  
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            result+=nums[i];
        }
        return result;
    }
}
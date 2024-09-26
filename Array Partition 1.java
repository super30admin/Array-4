// Time Complexity : O(nlogn); where n = size of the array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i + 2){
            max += nums[i];
        }
        return max;
    }
}

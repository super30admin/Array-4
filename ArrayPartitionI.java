// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2)
            sum += nums[i];
        return sum;
    }
}
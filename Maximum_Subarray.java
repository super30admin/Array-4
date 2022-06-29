//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        //initialize using first element
        int max = nums[0]; int rSum = nums[0];
        //starting from second element
        for(int i = 1; i < nums.length; i++){
           //If running sum is less ignore else keep adding to it.
           rSum = Math.max(rSum+nums[i],nums[i]);
           max = Math.max(max,rSum);
        }
        return max;
    }
}

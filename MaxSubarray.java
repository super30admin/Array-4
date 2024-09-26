/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the *largest sum and return its sum.
* TC O(N) SC O(1)
*/
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
       int rMax = nums[0], max = nums[0];
        int start = 0, end = 0, currStart = 0;
        for (int i = 1; i< nums.length; i++) {
            if (nums[i] > rMax + nums[i]){
                currStart = i;
                rMax = nums[i];
            }
            else {
                 rMax = nums[i] + rMax;
            }
            if (rMax > max) {
                max = rMax;
                start = currStart;
                end = i;
            }
            rMax = Math.max(rMax + nums[i] , nums[i]);
            max = Math.max(rMax, max);
        }
        return max;
    }
}

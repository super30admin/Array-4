/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        //base
        if(nums.length == 0){
            return -1;
        }

        //variables
        int max_sum = nums[0], rSum = nums[0];

        //logic
        for(int i=1; i<nums.length; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, rSum);
        }

        //return the maximum sum
        return max_sum;
    }
}
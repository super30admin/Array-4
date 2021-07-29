
// Time - O(N)
// Space - O(1)


class Solution {
    public int maxSubArray(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        int rSum = nums[0]; // initialize the running sum
        int max = nums[0]; // initialize the max val

        for(int i = 1; i < nums.length; i++) {

            rSum = Math.max(rSum + nums[i],nums[i]); // calculate the running sum by making a contigous subarray or choose element itself whichever is better

            max = Math.max(rSum, max); // calculate the max between earlier running sum and max

        }

        return max;

    }
}
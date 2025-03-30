// Time Complexity: O(n) where n is the number of elements in the array
// Space Complexity: O(1)

class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int currMax = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            currMax = Math.max(nums[i] + currMax, nums[i]);
            max = Math.max(max, currMax);
        }

        return max;
    }
}

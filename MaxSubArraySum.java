// Time Complexity - O(n)
// Space Complexity - O(1)
// Kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum = Math.max(nums[i],nums[i]+sum); // incoming number greater than current sum
            max = Math.max(max,sum); 
        }
        return max;
    }
}
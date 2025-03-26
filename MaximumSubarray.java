//The approach here is to take the maximum of the sum of current subarray or the new value for current maximum and then compare that with overall maximum to get the maximum subarray sum
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int curr = nums[0];
        for(int i = 1; i < n; i++){
            curr = Math.max(curr+nums[i], nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }
}
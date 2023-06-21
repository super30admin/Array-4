//TC: O(n)
//SC: O(1)

public class max_subarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int largestSum = nums[0];
            int currentSum = nums[0];
            
            for (int i = 1; i < nums.length; i++) {
                if (currentSum + nums[i] > nums[i]) {
                    currentSum = currentSum + nums[i];
                } else {
                    currentSum = nums[i];
                }
                
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                }
            }
            
            return largestSum;
        }
    }
}

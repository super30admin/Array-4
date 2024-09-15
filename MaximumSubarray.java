// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Calculate running sum of the elements in the array, check if sum is negative, then reset the sum, while finding the max sum encountered till that point.

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

public class MaximumSubArray {
    /**
    Forward pass

    Time complexity: O(n)
    Space complexity: O(1)

    Were you able to solve this on leetcode? Yess
    */
    public int maxSubArray(int[] nums) {
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            
            currentSubArray = Math.max(curr, currentSubArray + curr);
            maxSubArray = Math.max(maxSubArray, currentSubArray);
        }
        
        return maxSubArray;
    }
}

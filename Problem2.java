package Array-4;
// TC: 
public class Problem2 {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currSum = Math.max(nums[i], nums[i]+currSum);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum; 
    }
}

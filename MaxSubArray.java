// TIme Complexity: O(N)
// Space Complexity: O(1)
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null) return -1;
        int max = nums[0];
        int currSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            max = Math.max(max, currSum);
        }
        return max;
    }
}

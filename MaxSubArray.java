//Time Complexity: O(n)
//Space Complexity: O(1)
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++) {
            curr = Math.max(nums[i], curr+nums[i]);
            max = Math.max(max,curr);

        }
        return max;
    }
}

//TC: O(n)
//SC: O(n)
//approach: dp

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max=dp[0];
        if(nums.length==1) return nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = nums[i] + Math.max(0, dp[i-1]);
            System.out.println(dp[i]);
            max = Math.max(max, dp[i]);
            System.out.println(max);
        }
        return max;
    }
}

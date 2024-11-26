//Time Complexity O(N)
//Space Complexity O(1)
//Leetcode tested

public class MaximumSubArray53 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int rSum = nums[0];
        for(int i=1;i < nums.length;i++){
            rSum = Math.max(rSum+nums[i],nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}

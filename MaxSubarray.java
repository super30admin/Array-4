public class MaxSubarray {
    //TC = O(n) SC=O(1)
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int currSum = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            max = Math.max(max,currSum);
        }
        return max;
    }
}

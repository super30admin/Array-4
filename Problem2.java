//Time Complexity : O(N)
//Space Complexity : O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int totalMaxSum = nums[0], i=0, j=1, curSum = nums[0];
        while(j < nums.length){
            if(totalMaxSum < curSum) totalMaxSum = curSum;
            if(curSum < 0 || curSum + nums[j] < 0) {
                i=j;
                j++;
                curSum = nums[i];
            }else {
                curSum+=nums[j];
                j++;
            }
        }
        return Math.max(curSum, totalMaxSum);
    }
}

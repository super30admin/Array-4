//time O(n)
//space O(1)

class Solution {
    //[-2,1,-3,4,-1,2,1,-5,4]
    //    i
    // -2 -1
    public int maxSubArray(int[] nums) {
        int rSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        while (i < nums.length) {
            if(rSum + nums[i] < nums[i]) {
                rSum = nums[i];
            } else {
                rSum += nums[i];
            }
            maxSum = Math.max(rSum, maxSum);
            i++;
        }
        return maxSum;
    }
}

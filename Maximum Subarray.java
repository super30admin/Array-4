
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubArrSum = nums[0];
        int maxSubArrSum = nums[0];

        for(int i =1;i < n; i++){//tc-O(n)
            currSubArrSum = Math.max(nums[i], currSubArrSum + nums[i]);
            maxSubArrSum = Math.max(maxSubArrSum, currSubArrSum);
        }

        return maxSubArrSum;
    }
}
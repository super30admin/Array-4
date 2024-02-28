class Solution {
    //TC: O(n)
    //SC: O(1)
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currSum  = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(max, currSum);
        }
        return max;
    }
}

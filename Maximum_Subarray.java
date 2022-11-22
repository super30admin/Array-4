// TC : O(n)
// SC : O(1)
// Method : Kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rsum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int k : nums) {
            rsum = rsum + k;
            max = Math.max(rsum, max);
            if(rsum < 0)
                rsum = 0;
        }
        return max;
    }
}

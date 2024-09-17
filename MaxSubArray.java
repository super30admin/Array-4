//TimeComplexity: O(n)
//SpaceComplexity: O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i< n; i++){
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(max, rsum);
        }
        return max;
    }
}

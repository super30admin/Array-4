// TC = O(n)
// SC = O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int rsum = nums[0];
        for(int i = 1; i<n; i++){
            rsum =Math.max(rsum + nums[i], nums[i]);
            max = Math.max(max,rsum);
        }
        return max;
    }
}

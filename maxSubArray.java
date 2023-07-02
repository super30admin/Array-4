// tc :  O(n)
// sc : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum =0;
        for(int num : nums){
            max = Math.max(max,sum+num);
            sum=Math.max(0,sum+num);
        }
        return max;
    }
}

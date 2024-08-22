// TC:O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int rsum = nums[0];
        int max = nums[0];
        int st = 0; int end = 0;
        for(int i=1;i<nums.length;i++){
            rsum = Math.max(nums[i], rsum+nums[i]);
            if(rsum>max){
                if(max==rsum){
                    st = i;
                }
                max = rsum;
                end = i;
            }
        }
        return max;
    }
}
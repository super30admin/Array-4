//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int rsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(rsum<=0){
                rsum=nums[i];
            }
            else{
                rsum+=nums[i];
            }
            max=Math.max(max,rsum);
        }
        return max;
    }
}
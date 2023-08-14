// TC:O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int currSub =nums[0];
        int maxSub =nums[0];
        
        for(int i=1;i<nums.length;i++){
            int x= nums[i];
            
            currSub= Math.max(x, x+currSub);
            maxSub= Math.max(currSub,maxSub);
        }
        
        return maxSub;
    }
}

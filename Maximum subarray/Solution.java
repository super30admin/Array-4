// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length<=1) return nums[0];
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(sum<0) sum=0;
            sum = sum + nums[i];
            
            if(max<sum) max=sum;
        }
        return max;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
//Did it run on leetcode  : yes

class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0;
        int maxSum =Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+nums[i];
            maxSum=Math.max(sum,maxSum);
            
        }
        return maxSum;
    }
}
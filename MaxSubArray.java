//Time Complexity:O(N)
//SPace Complexity:O(N)
//Approach- The idea is to create a dp array, that holds the first element of the array initially.Then the dp array is updated in such a way that if the previous element in the dp array is positive, then it is added to the current element from the nums array. Else 0 is added to the current element from the nums array and that is assigned to the current index of the dp array.
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        if(nums.length==0){
            return Integer.MIN_VALUE;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
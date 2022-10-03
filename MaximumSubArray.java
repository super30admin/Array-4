//TC : O(n)
//SC : O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int max = nums[0];
        int currSum = nums[0];
        for(int i =1;i<nums.length;i++){
            currSum = Math.max(currSum+nums[i],nums[i]);
            max = Math.max(currSum,max);
        }
        return max;
    }
    
   /* public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currSum = nums[0];
        int currS = 0;
        int maxS = 0, maxE = 0;
        for(int i =1;i<n;i++){ 
            if(currSum+nums[i] < nums[i]){
                currSum = nums[i];
                currS = i;
            }else{
                currSum += nums[i];
            }
            
            if(currSum > max){
                max = currSum;
                maxS = currS;
                maxE = i;
            }
            max = Math.max(currSum,max);
        }
        //System.out.println(maxS +" " + maxE);
        return max;
    }*/
    
    //dp
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n+1];
//         dp[0]=0;
//         int max =Integer.MIN_VALUE;
//         for(int i =1;i<n+1;i++){
//             dp[i] = Math.max(nums[i-1],dp[i-1]+nums[i-1]);
//             max = Math.max(max,dp[i]);
//         }
        
//         return max;
//     }
}

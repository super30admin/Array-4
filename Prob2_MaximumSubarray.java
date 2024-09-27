//TC : O(n) // Single pass
//SC : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)    return 0;
        if(nums.length == 1)    return nums[0];
        
        int start = 0;
        int end = 0;
        //Indices of subarray having sum Maximum
        
        
        int maxSum = nums[0];   
        int currSum = nums[0];
        int currStart = 0; // Start index of curr Subarray
        for(int i = 1; i< nums.length; i++){
            //currSum = Math.max(currSum + nums[i], nums[i]);
            if(currSum + nums[i] < nums[i]){
                currStart = i;
                currSum = nums[i];
            } else{
                currSum += nums[i];
            };
            
            if(maxSum < currSum){
                maxSum = currSum;
                start = currStart;
                end = i;
            }
            //maxSum = Math.max(currSum , maxSum);
        }
        System.out.println(start + "  " + end);
        return maxSum;
    }
}
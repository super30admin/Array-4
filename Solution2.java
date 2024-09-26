//53. Maximum Subarray
// Using divide and conquer
// Time - O(nlogn)
//Space - O(logn) for recursion stack
class Solution2 {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }
    
    public int maxSubArray(int[] nums,int left,int right){
        
        if(left == right) return nums[left];

        int mid = (left + right) / 2;
        
        int leftSum = maxSubArray(nums, left, mid);
        int rightSum = maxSubArray(nums, mid + 1, right);
        int crossSum = crossSum(nums, left, mid, right);
        
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    
    public int crossSum(int[] nums, int left, int mid, int right){
        int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i = mid; i > left - 1; --i){
            currSum += nums[i];
            leftSum = Math.max(currSum, leftSum);
        }
        
        currSum = 0;
        for(int i = mid + 1; i < right + 1; ++i){
            currSum += nums[i];
            rightSum = Math.max(currSum, rightSum);
        }

        
        return leftSum + rightSum;
    }
}
// optmised - using DP
// Time - O(n)
// Space - O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] > 0) nums[i] += nums[i - 1];
            
            max = Math.max(max, nums[i]);
            
        }
        
        return max;
    }
}

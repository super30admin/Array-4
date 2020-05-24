

class Solution {
    public int maxSubArray(int[] nums) {
        // return kadaneAlgo(nums);
        return helper(nums,0,nums.length-1);

    }

    /**
     * Time Complexity - O(n)
     * Space Complexity - O(maxDepth) - recursive
     */
    // Method 1 - Divide Conquer Concept
    private int helper(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }

        int mid = (left+right) >> 1;
        int leftSum = helper(nums,left,mid);
        int rightSum = helper(nums,mid+1,right);
        int crossSum = crossSum(nums,left,mid,right);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    private int crossSum(int[] nums, int left, int mid, int right){

        int currSum=0, leftMax = Integer.MIN_VALUE;

        for(int i = mid; i >= left; i--){
            currSum += nums[i];
            leftMax = Math.max(currSum, leftMax);
        }

        int rightMax = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = mid+1; i<= right; i++){
            currSum += nums[i];
            rightMax = Math.max(currSum, rightMax);
        }

        return leftMax+ rightMax;
    }


    /**
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     */
    //Method 2
    private int kadaneAlgo(int[] nums){
        // Kadane's Algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
//APPROACH: Iterate over the array while maintaining two variables a global sum and a localsum. As you iterate over the array, try to find if the sum is greater with just incoming element alone or adding it to previous local sum. If the incoming element alone gives greater sum then update the localsum to the value of that element and repeat. At each point compare global sum and local sum and if local sum is larger update the value of global sum to that.

//time complexity O(n)
//space complexity O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxSum = nums[0]; int localSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            localSum = Math.max(nums[i], localSum + nums[i]);
            maxSum = Math.max(maxSum, localSum);
        }
        return maxSum;
    }
}

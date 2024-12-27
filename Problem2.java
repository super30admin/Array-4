class Problem2 {
    //TC:O(N)
    //SC:O(1)
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum +=nums[i];
            //Greedy if you get a chance to clear the Debt clear it by setting it with the current value
            if(sum<nums[i]) {
                sum=nums[i];
            }
            //if the max sum is greater than previous max then that is the max sum
            if(maxSum<sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
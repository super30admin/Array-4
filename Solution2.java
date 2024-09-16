//Time complexity: O(N), where N is the length of nums array.
//Space complexity: O(1)

class Solution2 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        for(int num: nums) {
            runningSum = Math.max(runningSum + num, num); 
            maxSum = Math.max(maxSum, runningSum); 
        }
        return maxSum; 
    }
}
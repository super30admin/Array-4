//Time O(N)
//Space O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int n : nums) {
            sum += n;
            if (sum < n) {
                sum = n;
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
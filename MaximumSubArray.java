//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num: nums)
        {
            sum = Math.max(sum + num, num);
            max = Math.max(sum, max);
        }

        return max;
    }
}
class Solution {
    // Also just print the position of start and end as additional task
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int rSum = nums[0];
        int max = nums[0];

        int n = nums.length;
        int curStart = 0;
        int curEnd = 0;
        int start = 0;
        int end = 0;

        for (int i = 1; i < n; ++i) {
            if (rSum < 0) {
                rSum = nums[i];
                curStart = i;
            } else {
                rSum += nums[i];
            }

            if (rSum > max) {
                max = rSum;
                start = curStart;
                end = i;
            }
        }
        System.out.println(start + " " + end);
        return max;
        
    }
}
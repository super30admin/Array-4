class Solution {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int runsum = nums[0];
        int curSt = 1;
        int st = 1;
        int end = 1;
        for (int i = 1; i < nums.length; i++) {
            // runsum = Math.max(nums[i], runsum + nums[i]);
            runsum += nums[i];
            if (nums[i] > runsum) {
                runsum = nums[i];
                curSt = i;
            }
            // max = Math.max(max, runsum);
            if (runsum > max) {
                max = runsum;
                st = curSt;
                end = i;
            }

        }

        System.out.println(st);
        System.out.println(end);
        return max;

    }
}
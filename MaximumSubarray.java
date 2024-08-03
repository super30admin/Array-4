class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        // using running sum logic

        int rSum = nums[0];
        int max = nums[0];
        int currStart = 0;
        int start = 0;
        int end = 0;
        for(int i = 1; i < nums.length; i++) {
            if(rSum + nums[i] > nums[i]) {
                rSum = rSum + nums[i];
            } else {
                currStart = i;
                rSum = nums[i];
            }
            if(rSum > max) {
                max = rSum;
                start = currStart;
                end = i;
            }
            // rSum = Math.max(rSum + nums[i], nums[i]);
            // max = Math.max(max, rSum);
        }
        System.out.println("start" + start + "End" + end);
        return max;
    }
}

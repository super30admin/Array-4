/***
 TC - O(n)
 SC - O(1)
 */
class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        int rSum = nums[0];
        int max = nums[0];
        int currStart = 0;
        int start = 0;
        int end =0;

        for(int i =1; i < nums.length; i++) {
            if(rSum + nums[i] > nums[i]) {
                rSum += nums[i];
            }
            else {
                currStart = i;
                rSum = nums[i];
            }

            if(rSum > max) {
                max = rSum;
                start = currStart;
                end = i;
            }
        }

        return max;

    }
}

public class MaxSubarray {
    // TC O(N)
    // SC O(1)
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rsum = nums[0];
        int max = nums[0];
        int currSt = 0;
        int start = 0, end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (rsum + nums[i] < nums[i]) {
                currSt = i;
                rsum = nums[i];
            } else {
                rsum = rsum + nums[i];
            }
            if (max < rsum) {
                start = currSt;
                end = i;
                max = rsum;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}

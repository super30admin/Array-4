public class maxSubarray {
    //On TC O1 SC
    public int maxSubArray(int[] nums) {
        int rsum = nums[0];
        int msum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsum = Math.max(rsum + nums[i], nums[i]);
            msum = Math.max(msum, rsum);
        }
        return msum;
    }
}

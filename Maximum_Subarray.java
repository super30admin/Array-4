public class Maximum_Subarray {
    //TC: O(n)
    //SC: O(1)
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currsum = nums[0];
        int start = 0;
        int end = 0;

        for(int i = 1; i < n; i++){
            currsum = Math.max(currsum + nums[i], nums[i]);
            max = Math.max(max, currsum);
        }
        return max;

    }
}

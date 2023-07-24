public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];
        // System.out.println (cs + " " + ms);
        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(cs, ms);
            // System.out.println(cs + " " + ms);
        }
        return ms;
    }

    public static void main(String[] args) {
        MaximumSubArray solution = new MaximumSubArray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}

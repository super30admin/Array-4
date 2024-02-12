// Time complexity : O(n)
// Space complexity : O(1)
class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = { 2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max_so_far = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_so_far = Math.max(nums[i], max_so_far + nums[i]);
            max = Math.max(max, max_so_far);
        }
        return max;
    }
}
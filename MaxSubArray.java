//Time Complexity:O(N)
//SPace Complexity:O(N)

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int rsum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(max, rsum);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray.maxSubArray(nums);

        System.out.println("The maximum subarray sum is: " + result);
    }
}

// TC: O(n) as all the numbers are touched upon.
// TC: O(1) as no auxilliary space is used.

// two vars are used to store the rSum max and overall max In the loop, rSum is checked with the existing + adding current or just current.
// Max has the max rSum.
public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5 })); // 6
        System.out.println(maxSubArray(new int[] { 1 })); // 1
        System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 })); // 23
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int max = nums[0];
        int rSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(max, rSum);
        }
        return max;
    }
}

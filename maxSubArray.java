// approch 1
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// approch 2
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Main {
    // approch 1 find all subarray and find maximum (brute force)
    public static int maxSubArray1(int[] nums) {
        // null case
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        // find all subarry
        for (int i = 0; i < n; i++) {
            int curSum = 0;
            for (int j = i; j < n; j++) {
                // running sum
                curSum += nums[j];
                // update the maximum
                max = Math.max(max, curSum);
            }
        }
        // return maximum
        return max;
    }

    // approch 2 using kadane's algorithm
    public static int maxSubArray2(int[] nums) {
        // null case
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        // maximum sum
        int max = nums[0];
        // current running sum
        int curSum = nums[0];

        // here we are going to check if incoming element is greater than
        // current running sum then we are going to reset currentSum with
        // incoming element and every time we update the maximum sum
        for (int i = 1; i < n; i++) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            max = Math.max(max, curSum);
        }
        // return maximum
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray1(nums));
        System.out.println(maxSubArray2(nums));

    }
}
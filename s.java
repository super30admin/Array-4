class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // find pivot
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    // The swap and reverse methods belong here, at the same level as
    // nextPermutation
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

//
class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // 1. Start a new subarray here (sum would be just 'num').
            // 2. Extend the previous best subarray by adding 'num' to it (sum would be
            // currentMax + num).
            // We choose whichever is larger.
            currentMax = Math.max(num, currentMax + num);

            // After finding the best subarray ending at 'i', we check if it's
            // better than the best subarray found anywhere so far.
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;

    }
}

//
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxsum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            maxsum = maxsum + Math.min(nums[i], nums[i + 1]);

        }
        return maxsum;
    }
}
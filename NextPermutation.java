class Solution {

    //TC: O(n)
    //TC: O(1)
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return;
        }
        int i = n - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }
        if (i == 0) {
            reverse(nums, i, n - 1);
            return;
        }
        int cand = i;
        for (int j = i; j < n; j++) {
            if (nums[j] <= nums[i - 1]) {
                break;
            }
            cand = j;
        }
        // swap nums[i-1] and nums [cand]
        int temp = nums[i - 1];
        nums[i - 1] = nums[cand];
        nums[cand] = temp;
        reverse(nums, i, n - 1);

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
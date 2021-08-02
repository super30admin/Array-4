class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        //Find if the nums array is all increasing like 4, 3, 2, 1
        //i pointer reaches the point where there is a decrease
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        //If i is not out of bounds and the nums array is not all decreasing
        if (i >= 0) {
            int j = n-1;
            //Find the j position
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

    }

    private void reverse(int[] nums, int start, int end) {

        while (start < end) {

            swap(nums, start, end);
            start++; end--;

        }

    }

    private void swap(int[] nums, int start, int end) {

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
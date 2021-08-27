// TC: O(n)
// SC: O(n)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) {
            return;
        }

        int i = nums.length - 2;

        // find breach
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }


        // find number to swap
        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[i] >= nums[j]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // reverse the right
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
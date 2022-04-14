//  Time Complexity: O(n)
//  Space Complexity: O(1)

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        //  find the index to swap
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        //  find the next greater number on the right to swap with
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        //  reverse numbers on the right of the breach
        reverse(nums, i+1, nums.length-1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

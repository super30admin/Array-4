// Time complexity: O(n) for the loop
// Space complexity: O(1) for the swap and reverse operations

// Intuition: 
// The next permutation algorithm finds the next lexicographical permutation of an array of numbers
// Find the first non-decreasing element from right to left
// Find element immediately greater than current to swap
// Reverse the remaining ones, which will give me the smallest number among the permutations

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null)
            return;
        int n = nums.length;
        int i = n - 2;
        // find breach
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // find the number on right of breach to swap with
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);

    }

    public void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}

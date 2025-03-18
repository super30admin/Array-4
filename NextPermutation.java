/*
 * TC: O(n)
 * SC: O(1)
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int m = nums.length;
        int i, j;
        i = m - 2;
        // find the first decreasing element
        while(i >= 0 && nums[i + 1] <= nums[i]) i--;
        // if i < 0 then nums is in decreasing order
        if(i >= 0) {
            j = m - 1;
            // find the last element that is greater than nums[i]
            while(nums[j] <= nums[i]) j--;
            // swap those two elements
            swap(nums, i, j);
        }
        // reverse the remaining array (full array in case i = -1)
        reverse(nums, i + 1, m - 1);
    }
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    void reverse(int[] nums, int j, int k) {
        while(j < k) {
            swap(nums, j++, k--);
        }
    }
}

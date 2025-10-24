//TC: O(n), SC: O(1)
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        //1, 3, 2, 4 -> 1, 3, 4, 2
        //1, 4, 3, 2 -> 2, 4, 3, 1 -> 2, 1, 4, 3

        int n = nums.length;
        int i = nums.length - 2;

        while (i >= 0 && nums[i] > nums[i + 1]) i--;

        if (i >= 0) {
            int j = n - 1;
            while (nums[i] >= nums[j]) j--;

            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}

public class NextPermutation {
    // TC: O(N) where N is length of array
    // SC: O(1)
    public void nextPermutation(int[] nums) {
        int decIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                decIndex = i - 1;
                break;
            }
        }
        if (decIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[decIndex]) {
                int temp = nums[i];
                nums[i] = nums[decIndex];
                nums[decIndex] = temp;
                break;
            }
        }
        reverse(nums, decIndex + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

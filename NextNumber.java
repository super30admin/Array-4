public class NextNumber {
    // TC O(N)
    // SC O(1)
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int k = nums.length - 1;
        i++;
        while (k > i) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k--;
            i++;
        }
    }
}

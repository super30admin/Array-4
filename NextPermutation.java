// Time complexity : O(n)
// Space complexity : O(1)
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] > nums[i + 1]) {
            i--;
        }

        int j = n - 1;
        if (i >= 0) {
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, j);
    }

    private static void swap(int[] nums, int low, int high) {
        if (low != high) {
            nums[low] = nums[low] + nums[high];
            nums[high] = nums[low] - nums[high];
            nums[low] = nums[low] - nums[high];
        }
    }

    private static void reverse(int[] nums, int low, int high) {
        while (low <= high) {
            swap(nums, low, high);
            low++;
            high--;
        }
    }
}

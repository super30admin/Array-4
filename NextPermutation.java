// Time Complexity : O(n)
// Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0);

        int n = nums.length;
        int index = -1;

        // Step1: Find the breach or element which is smaller than element to right
        for (int i = n-2; i>=0;i--) {
            if (nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        // Step2: Find the elment from the right which is just greater than the element found in index
        if (index != -1) {
            for (int i = n-1; i >index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }
        }

        // Step 3: reverse the part form index + 1 till the end
        reverse(nums, index+1, n-1);
    }

    private void swap (int[] nums, int l, int r) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l <=r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }
}

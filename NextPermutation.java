package Array4;

public class NextPermutation {
    /* Created by palak on 8/17/2021 */

    /**
     Recursion with backtracking.
     1. Find the Breach
     2. Swap
     3. Reverse

     TC: O(n)
     SC: O(1)
     */
    public void nextPermutation(int[] nums) {
        if(nums == null)    return;
        // First find the breach
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // If no breach is there, then no swap will happen. Only reverse will happen. It means we have teh largest possible number and now we need to return the smallest permutation that can be formed with those numbers.
        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int nums[], int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {

    }
}

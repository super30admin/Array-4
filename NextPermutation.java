//Time Complexity - O(N)
//Space Complexity - O(1)

/**
 * Computes the next lexicographical permutation of the input array in-place.  
 * Finds the first decreasing element from the end, swaps it with the next larger element, and reverses the suffix.  
 * Ensures the result is the next higher permutation or resets to lowest if none exists.  
 */

public class NextPermutation {
    public void nextPermutation(int[] nums) {

        int i = nums.length -2; 

        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--; 
        }

        if(i >= 0) {
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int end = nums.length -1; 
        while(start <=end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}


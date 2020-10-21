// Time Complexity : O(n) n is number of elements in the input array
// Space Complexity : O(1) Constant Space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Find the left index of the peak index from the right end of the array. (Peak Index is the first index having the left element (peak--) lesser that itself)
//now find the next new first peak element and it's index which is greater than out left peak element from the right end.
// swap them both (Left Peak element and Next new first peak element from the right).
// Reverse the whole array starting from the next new first peak index to end of array.
// if not found simply reverse the whole array.

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0 || nums == null) {
            return;
        }
        int peak_index = nums.length - 2;

        while(peak_index >= 0 && nums[peak_index] >= nums[peak_index+1]) {
            peak_index--;
        }

        if(peak_index >= 0) {
            int new_peak_index = nums.length - 1;

            while(nums[new_peak_index] <= nums[peak_index]) {
                new_peak_index--;
            }

            swap(nums, peak_index, new_peak_index);
        }

        reverse(nums, peak_index + 1, nums.length - 1);
    }

    public void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    public void reverse(int[] arr, int left, int right) {

        while(left < right){
            swap(arr,left++,right--);
        }
    }
}
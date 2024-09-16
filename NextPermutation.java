// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        //step 2
        int j = nums.length - 1;
        if(i >= 0) {
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i , j);
        }

        reverse(nums, i+1, nums.length - 1);
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private void reverse(int[] arr, int i, int j) {
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
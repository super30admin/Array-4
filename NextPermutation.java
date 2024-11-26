// Time Complexity : O(n), n = length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i+1] <= nums[i])
            i--;
        
        if(i >= 0) {
            int j = n-1;
            while(nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);    
    }
    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
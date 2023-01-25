// Next Permutation

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null)
            return;
        int n = nums.length;
        int i = n - 2;
        // 1. Find the breach
        while(i >= 0 && nums[i] >= nums[i+1])
            i--;
        // 2. Swap with just the greater digit
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        // 3. Reverse the last part alone
        reverse(nums, i + 1, n - 1);


    }
    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l , r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
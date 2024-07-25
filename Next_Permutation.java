// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i>=0 && nums[i] >= nums[i+1] ){
            i--;
        }
        // find next bigger element, useful for repeating numbers
        int j = n-1;
        if(i!=-1){
            while(j>=0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    private void swap(int nums[], int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int []nums, int i, int j){
        while(i<= j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
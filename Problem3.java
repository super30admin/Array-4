// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    private void reverse(int[] nums,int left, int right){
        while(left < right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        int j = n - 1;
        if(i >= 0){
            while(nums[i] >= nums[j])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
}
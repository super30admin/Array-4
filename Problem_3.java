// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// 1) Find the bridge when the number from right is grater then the number on its left. 2) find the number which is grater then the selected bridge starting from the end(right), and replace both. reverse the whole string from the end( right) to the newly replaced number ( location of bridge)
// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int i = n-2;
        // finding the bridge when the next value is less then its previous from the right (end).
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        // then find the number which is grater then nums[i] stating from the end.
        int j = n-1;
        if( i >= 0){
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        // reverse the number from the bridge and till the end.
        reverse(nums, i+1, n-1);
    }
    private void reverse(int [] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
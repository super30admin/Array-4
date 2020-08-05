// Time Complexity : each operation O(3n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * https://leetcode.com/problems/next-permutation/submissions/
 *
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length ==0) return;
        
        int n = nums.length;
        
        //find the breach point
        int i = n-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        //find the number which is just greater than i
        
        //we found the breach if i >=0
        if(i >=0){
            int j = n-1;
            
            while(nums[j] <= nums[i]) {
                j--;
            }
            
            //swap
            swap(i, j, nums);
        }
        
        //reverse the part after i+1
        reverse(i+1, n-1, nums);
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int i, int j, int[] nums) {
        while(i < j){
            swap(i,j, nums);
            i++;j--;
        }
    }
}
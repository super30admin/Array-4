// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


class Solution {
    public void nextPermutation(int[] nums) {
        //edge 
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        //look for the breach
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //swap with greater int
        if(i >= 0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
        //call swap 
        swap(nums, i, j);
        }
    //reverse 
    reverse(nums, i+1, n-1);
    }
    
    private void reverse(int [] nums, int i, int r){
        while(i <= r){
            swap(nums, i, r);
            i++;
            r--;
        }
    }
    
    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
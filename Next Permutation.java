// 31. Next Permutation
// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach
class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        
        //here the series breaks for asc. order for i. 
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        
        int j = len - 1;
        
        if(i>=0) {
            // get j which is just greater than nums[i] and swap
            while(nums[i]>=nums[j]) j--;        
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, len -1 ); // reverse the array from ith position to end to get the 
        }
    
    private void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
     private void reverse(int [] nums, int i, int j)
    {
        while(i<j)
        {
            swap(nums, i,j);
            i++; j--;
        }
    }
    }
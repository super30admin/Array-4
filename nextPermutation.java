
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class Solution {
    public void nextPermutation(int[] nums) {
        int i =1;
        for(i = nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]) break;
        }
        int x = 0;
        if(i<0) 
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        for(x=nums.length-1;x>=0;x--)
        {
            if(nums[x]>nums[i]) break;
        }
        
        int temp = nums[i];
        nums[i]= nums[x];
        nums[x]=temp;
        
        reverse(nums,i+1,nums.length-1);
        
        
    }
    private void reverse(int[] nums, int low , int high)
    {
        while(low<high)
        {
            int temp = nums[low];
            nums[low]= nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}
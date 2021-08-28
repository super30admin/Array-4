// Time Complexity :o(N)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums==null||nums.length==0)
            return;
        
        int n=nums.length,i=n-2;
        
        //find the breach in array
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        
        if(i>=0)
        {
            int j=n-1;
            
            while(nums[i]>=nums[j])
                j--;
            
            //swap i and j index elements
            swap(nums,i,j);
        }
        //reverse the array
        reverse(nums,i+1,n-1);
    }
    
    private void reverse(int[] nums,int left,int right)
    {
        while(left<right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    
    private void swap(int[] nums,int left,int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
//https://leetcode.com/problems/next-permutation/submissions/
// Time Complexity :O(n)  
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        
        if(i>=0) //means breach is found and not the case of 43210
        {
            
            int j=n-1;
            //finding the just immediate greater element
            while(nums[i]>=nums[j])
                j--;
            swap(nums,i,j); //once the next largest element to breach found swap it
        }
        reverse(nums,i+1,n-1); //reverse from next point of breach
        
    }
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    private void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
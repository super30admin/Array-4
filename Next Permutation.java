// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
//We need to iterate through the number from the end. They should be in an increasing order as we need to find the next bigger number. While iterating, when we come across a number which is lesser than the previous number, then that is the number which is supposed to be replaced. The number just greater than it is the one with which we will replace it. We will swap these numbers. Then we will reverse the remaining numbers after the bigger swapped number.

class Solution {
    public void nextPermutation(int[] nums) {
        
        //find breach
        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }

        if(i>=0)    //if we have found a breach
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }
             //swap
            swap(nums,i,j);
        }
        //reverse
        reverse(nums,i+1,nums.length-1);
    }

    private void swap(int[]nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[]nums, int l, int r)
    {
        while(l<r)
        {
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}
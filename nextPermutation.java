// Time O(n) or O(1) if 2^32 is set.
// Space O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length==0 || nums.length==1)
            return;
        
        
        int n=nums.length;
        
        /* Find the breach */
        int i=n-2;
        while(i>=0)
        {
           if(nums[i]<nums[i+1])
               break;
            i--;
        }
        
        int j=n-1;
        /* Find the element to be swapped */
        while(j>i && i>=0)
        {
            if(nums[j]>nums[i])
            {
                swap(nums,i,j);
                break;
            }
            j--;
        }
        
        /* Reverse the element after i */
        reverse(nums, i+1);
    }
    
    private void reverse(int[] nums, int start)
    {
        int end=nums.length-1;
        
        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
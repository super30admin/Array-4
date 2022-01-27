//T.C = O(N)
//S.C = O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        
        int index =-1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                index = i;
                break;
            }
        }
        
        if(index!=-1){
        for(int i = n-1 ;i>=0;i--)
        {
            if(nums[i] > nums[index])
            {
                swap(nums,i,index);
                break;
            }
        }
        }
        
        reverse(nums,index+1,n-1);
        
        
    }
    
    private void swap(int[] nums ,int l , int r)
    {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r]=temp;
    }
    
    private void reverse(int[] nums , int l , int r)
    {
        while(l<r)
        {
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}
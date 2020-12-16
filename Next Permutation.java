//Time complexity:O(n)
//space complexity:O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        //edge
        if(nums.length==0|| nums==null) return;
        int n=nums.length;
        int r=n-2;
        //int i=0; int j=0;
        while(r>=0 && nums[r]>=nums[r+1])
        {
            r--;
        }
        
        if(r>=0)
        {
            int j=n-1;
            while(j>=0 && nums[r]>=nums[j])
            {
                j--;
            }
            swap(nums,r,j);
        }
        
        reverse(nums,r+1,n-1);
        
    }
    public void swap(int[] nums,int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int i, int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;j--;
        }
    }
}

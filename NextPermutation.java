// 0(n)
class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        if(nums.length==0 || nums== null)
        {
            return;
        }
        int n = nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }

        }
        if(idx!=-1)
        {
            for(int i=n-1;i>=0;i--)
            {
                if(nums[i]>nums[idx])
                {
                    swap(nums,i,idx);
                    break;
                }
            }
        }
        reverse(nums,idx+1,n-1);
    }
    private void swap(int[] nums, int left, int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    private void reverse(int[] nums, int left, int right)
    {
        while(left<=right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }

}


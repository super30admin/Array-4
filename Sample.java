//*****124.31.NEXT PERMUTATION****
//Time complexity:o(n);
//Space complexity:o(1);
//Any doubts:N;


class Solution {
    public void nextPermutation(int[] nums) {
        
        //null case
        if(nums.length==0)
        {
            return;
        }
        
        //1.Find the breach
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        //we have found the number at i now
        //Swap it
        //2 cases if i reaches -1 then its the biggest number given
        if(i>=0)
        {
            //Find the next large element of nums[i];
            int j=nums.length-1;
            while(nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums, i, j);
        }
        
        //reverse
        reverse(nums, i+1, nums.length-1);
        
        
        
    }
    
    private void reverse(int[] nums, int l, int r)
    {
        while(l<r)
        {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    private void swap(int[] nums,int l, int r)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}

//****122.561.ARRAY PARTITION****
//Time complexity: nlogn
//Space complexity:o(1);
//Leetcode runnable: Y;
//Any doubts:N;

class Solution {
    public int arrayPairSum(int[] nums) {
        int result=0;
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i+=2)
        {
            result +=nums[i];
        }
     return result;   
    }
}

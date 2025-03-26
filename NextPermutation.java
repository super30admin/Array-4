class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int i=n-2;
        while(i>=0 && nums[i] >= nums[i+1])
        {
            i--;
        }
        //action digit i

        if(i>=0)
        {
            //next greater digit ro replace i
            int j = n-1;
            while(nums[i] >= nums[j])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }

    private void swap(int[] nums,int i, int j)
    {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    private void reverse(int nums[],int i,int j)
    {
        while(i<=j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
/*
first check two adjacent nuumbers from last if i < i+1 then i is the action digit
then replace it with just next greatest element on the right and then lastly reverse the nums from i+1 to end*/
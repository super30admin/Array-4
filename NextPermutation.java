package Array-4;
// Time Complexity : O(n)
// Space Complexity : O(1)

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        
        if(i>=0)
        {
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    private void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int index)
    {
        int end = nums.length - 1;
        int mid = index + (end - index)/2;
        for(int i=index;i<=mid;i++)
        {
            swap(nums,i,end);
            end--;
        }
    }
    
}

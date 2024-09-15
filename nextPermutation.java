//Time complexity: O(N)
//space: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums==null || nums.length==0)
            return ;
        int i, j;
        for( i=nums.length-2; i >=0; i--)
        {
            if(nums[i]< nums[i+1])
                break;
        }
        
        if(i>=0)
        {
            for( j=nums.length - 1; j > i; j--)
            {
                if(nums[j] > nums[i])
                   break;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, nums.length - 1);
    }
    
    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    // swap the elements on the given indices
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//Time Complexity: O(n); where n is the length of nums array
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem3 {

    public void nextPermutation(int[] nums) {
        
        if(nums == null|| nums.length == 0)
            return;
        
        int idx = -1;
        int n = nums.length;
        
        for(int i = n-2; i >=0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                idx = i;
                break;
            }   
        }
        
        if(idx != -1)
        {
            
            for(int i =n-1; i >=0; i--)
            {
                if(nums[i] > nums[idx])
                {
                    swap(nums, i, idx);
                    break;
                }
            }
        }
        
        reverse(nums, idx+1, n-1);
    }
    
    private void swap(int[] nums, int l, int h)
    {
        int temp = nums[l];
        nums[l] = nums[h];
        nums[h] = temp;
    }
    
    private void reverse(int[] nums, int low, int high)
    {
        int temp;
        while(low < high)
        {
          temp = nums[low];
          nums[low] = nums[high];
          nums[high] = temp; 
          low++;
          high--;
        }
    }
}

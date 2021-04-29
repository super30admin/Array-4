// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
      
      int peak_index = -1;
      int swap_index = -1;
      int n = nums.length;

      //find the peak index
      for(int i = n-2;i>=0;i--)
      {
        if(nums[i+1]>nums[i])
        {
          peak_index = i;
          break;
        }
      }
      //find the element to be swapped
      for(int i = n-1; i >= 0 && peak_index != -1; i--)
      {
            if(nums[i]>nums[peak_index])
            {
                swap_index = i;
                swap(nums, peak_index, swap_index);
                break;
            }
      }
      //rever the elemnts from next element of peak to the end and that would be our next permutation
      reverse(nums,peak_index+1,n);
      
    }
  
    private void swap(int[] nums,int i ,int j)
    {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  
    private void reverse(int[] nums,int left,int right)
    {
      right--;
      while(left<right)
      {
        swap(nums,left,right);
        left++;
        right--;
      }
    }
}
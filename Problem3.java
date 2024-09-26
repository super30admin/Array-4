//TC : O(n)
//SC : Constanct O(1)


class Solution {
    public void nextPermutation(int[] nums) {
       int ptr1 = nums.length-1;
       while(ptr1>0 && nums[ptr1] <= nums[ptr1-1]) ptr1--;
        
      if(ptr1>0){
          int p2 = nums.length-1;
          while(nums[p2]<=nums[ptr1-1]) p2--;
          swap(nums,ptr1-1,p2);
      }
     
      reverse(nums,ptr1,nums.length-1);  
        
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}

public class NextPermutation {
  /**
    
    Approach: 
    
    3 steps in total:
        1. Iterate on nums from the right and find the first element at index idx that satisfies nums[idx] < nums[idx+1]. 
        
        2. Iterate again from the right and find the element that is greater than element found in step 1. Swap the elements found in step 1 and 2.
        
        3. Reverse all the elements between index found in step 1 and nums.length
        
        4. Add additional conditional for the scenario where nums is strictly decreasing.

    Time Complexity: O(n)
    
    Space complexity: O(1)

    Were you able to solve this on leetcode? Yes
    */
    public void nextPermutation(int[] nums) {
      int right = nums.length - 2;
  
      while(right >= 0 && nums[right] >= nums[right+1]){
          right--;
      }
      
      if(right == -1){
          reverse(nums, 0, nums.length - 1);
          return;
      }

      // find the element on the right of right pointer that is just greater than nums[right]
      int curr = nums.length - 1;
      while(curr > right){
          if(nums[curr] > nums[right]){
              break;
          }
          curr--;
      }
      
      swap(nums, right, curr);
      reverse(nums, right+1, nums.length - 1);
  }
  
  
  void swap(int[] nums, int i , int j) {
      int temp = nums[j];
      nums[j] = nums[i];
      nums[i] = temp;
  }
  
  void reverse(int[] nums, int start, int end){
      while(start < end){
          swap(nums, start, end);
          start++;
          end--;
      }
  }
}

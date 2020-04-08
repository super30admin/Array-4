//31. Next Permutation
// Time complexity - O(n)
// Space complexity - O(1)
class Solution {
    public void nextPermutation(int[] nums) {

        if(nums.length <= 1) return;
        
        int n = nums.length;
        
        // find the first decreasing element from right to left and swap
        int i = n - 1;
        while(i >= 1 && nums[i - 1] >= nums[i]){
            i--;
        }
        
        // find the next largest element in the right of nums[i]
        i = i - 1;
       
        if(i >= 0){
            int j = 0;
            for(j = n - 1; j > i; j--){
                if(nums[j] > nums[i]) break;
            }
           
            swap(nums, i, j);
        }
        
         reverse(nums, i + 1, n - 1);
        
        
        
    }
    
    
    private void reverse(int[] nums, int start, int end){
      
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


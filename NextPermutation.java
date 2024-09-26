class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length ==0){
            return ;
        }
        
        int n = nums.length;
        int i = n-2;
        // step 1. find postn of smaller element than its adjacent
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        // step 2. swap that element with its immediaete greater element
        
        if(i >= 0){
            
            int j = n-1;
            
            while(j >=0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        
        // reverse  from positn +1 to end
        
        reverse(nums, i+1, n-1);
    }
    
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int l, int r){
        
        while(l<=r){
            swap(nums, l, r);
            l++;
            r--;
        }
        
    }
    
    
    
    
    
}
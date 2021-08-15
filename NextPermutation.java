// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int n = nums.length;
        int i = n - 2;
        
        while(i >= 0 && nums[i] >= nums[i + 1])
            i--;
        
        int j = n - 1;
        
        if(i >= 0){
            while(nums[i] >= nums[j])
                j--;
            swap(nums, i , j);
        }
        
        reverse(nums, i + 1, n - 1);
    }
    
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i ,j);
            i++;
            j--;
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
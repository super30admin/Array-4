// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0){
            int j = nums.length-1;
            while(nums[i] >= nums[j]) j--;
            swap(i,j,nums);
        }
        reverse(i+1,nums.length-1, nums);
        
    }
    
    private void swap(int i, int j, int[] nums){
        if(i >= 0 && i <= nums.length-1 && j >= 0 && j <= nums.length-1){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    
    private void reverse(int start, int end, int[] nums){
        while(start < end){
            swap(start,end,nums);
            start++;
            end--;
        }
    }
}

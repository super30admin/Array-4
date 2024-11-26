// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class nxtPermutation {
    public void nextPermutation(int[] nums) {
    
        if(nums == null) return;
        
        int i = nums.length-2;
        while(i >= 0  && nums[i] >= nums[i+1]){
            i--;
        }
        
        
        if(i >= 0){
            int j = nums.length-1;
            while(nums[i] >= nums[j])
                j--;
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, nums.length-1); 
        return;
    }
    
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
}

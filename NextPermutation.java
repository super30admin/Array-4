// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Find the breach starting from the end of array, the find the next larger number than the breach element and swap the two. Finally, reverse the sub array, which will give the next permutation.

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        // find the breach starting from the end of array 
        int i = 0;
        for(i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                break;
            }
        }
        
        // swap with number which is just greater than the breach, starting from the end
        if(i > 0 ){
            for(int j = nums.length - 1; j >= 0; j--){
                if(nums[j] > nums[i-1]){
                    swap(nums, j, i-1);
                    break;
                }
            }
        }
        
        // reverse the sub array, which will be the next largest permutation
        reverse(nums, i, nums.length - 1);
    }
    
    private void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

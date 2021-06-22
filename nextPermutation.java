// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
public class nextPermutation {
    public void nextPermutationp(int[] nums) {
        
   
    if(nums == null || nums.length == 0)
            return;

        int n = nums.length;
        int peak_index = -1;
        int peak_swap_elem_index = -1;

        // Finding the peak element
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                peak_index = i;
                break;
            }
        }

        // Find swap element index
        for(int i = n-1; i >= 0 && peak_index != -1; i--){
            if(nums[peak_index] < nums[i]){
                peak_swap_elem_index = i;
                // Swap
                swap(nums, peak_index, peak_swap_elem_index);
                break;
            }
        }

        // Reverse the remaining array after the peak element
        reverse(nums, peak_index+1, n-1);        
    }

    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

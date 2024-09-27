class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        
        int peak_index = -1;
        int swap_element_index = -1;
        //find peakElement's previous index
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                peak_index = i;
                break;
            }
        }
        //find swap element
        for(int i = nums.length - 1; i >= 0 && peak_index != -1; i--){
            if(nums[i] > nums[peak_index]){
                swap_element_index = i;
                //swap
                swap(nums, peak_index, swap_element_index);
                break;
            }
        }
        //reverse
        reverse(nums, peak_index+1, nums.length);
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end){
        end--;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

//Time Complexity: O(n)
// Space Complexity: O(1)
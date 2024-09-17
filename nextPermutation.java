//TC: O(n)
//SC: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int len = nums.length;//find len
        
        //find peak index and peak swap element's index
        int peak_index = -1; 
        int peak_swap_ele_index = -1;
        
        //find peak element
        for(int i = len-2; i >= 0; i--){
            if(nums[i]<nums[i+1]){
                peak_index = i;
                break;
            }
        }
        
        //find the swapped element
        for(int x = len-1; x >= 0 && peak_index != -1; x--){
            if(nums[peak_index] < nums[x]){
                peak_swap_ele_index = x;
                
                //swap
                swap(nums, peak_index,peak_swap_ele_index);
                break;
            }
        }
        //reverse
        reverse(nums, peak_index+1, len);
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(int[] arr, int start, int end){
        end--;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
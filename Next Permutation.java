class Solution {
    public void nextPermutation(int[] nums) {
        
        //Keep looking for a drop in the graph. Starting from the end
        
        int i = nums.length - 2;
        
        while(i >=0 && nums[i] >= nums[i + 1]){
            i--;
        }
        
        //After finding the drop. We have to replace that drop value by a just larger value.
        //We will keep another pointer at the end of the array. and keep moving that pointer until we find a value greater than drop.

        //5, 1, 2, 3, 4
        
        if(i >= 0){
            int j = nums.length - 1;
            while(j >=0 && nums[j] <= nums[i]){
                j--;
            }
            
            swap(nums, i, j);
        }
        
        //Reverse the remaining portion of array after i because descending order emans a larger number and ascending order means a smaller number.
        reverse(nums, i + 1);
        
    }
    
    //Function for reversing array
    
    public void reverse(int[] arr, int start){
        
        int i = start;
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
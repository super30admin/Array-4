//TC : O(n + n + n) == O(n)
//SC : O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)    return;
        
        //Check for breach  //O(n) time
        int i =  nums.length - 2;
        while(i >= 0){
            if(nums[i] < nums[i+1]){
                break;  
            } else{
                i--;
            }
        }
        // element at i will be replaced by just greater number than --- number at index i
        //O(n) time
        if(i >= 0){ // If breach happens then and then we will do swapping otherwise we will skip this step
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            
            swap(nums, i, j);
        }
        
        //O(n) time
        reverse(nums, i+1, nums.length - 1);
        
    }
    
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public void reverse(int[] nums, int i, int j){ // Reverse elements of array from index i to j
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }   
        
    }
        
}   
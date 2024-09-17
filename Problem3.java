// 31 Next permutation
// Time - O(n)
// Space - O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length - 1;
        int swappedPos = -1;
        
        for(int i = n; i > 0; i--){
            if(nums[i] > nums[i-1]){
                swappedPos = i - 1;
                break;
            }
        }
        
        if(swappedPos == -1){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        // find smallest number greater than swappedPos
        int smallestIndex  = 0;
        for(int i = swappedPos + 1; i < nums.length; i ++){
             if (nums[i] > nums[swappedPos]){
                 smallestIndex = i;
             }
        }
        
        // swap for the right pos
        int tem = nums[swappedPos];
        nums[swappedPos] = nums[smallestIndex];
        nums[smallestIndex] = tem;
        
        // reverse because we need the smallest element
        
        reverse(nums, swappedPos + 1, nums.length - 1);
    }
    
    public void reverse(int[] nums, int i, int j){

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i ++;
            j --;
        }
    }
}
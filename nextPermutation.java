//Time complexity O(n)
//Space complexity O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public void nextPermutation(int[] nums) {
        
        //find breach
        //swap breach with last index
        //swap from breach + 1 to last index
        int n = nums.length - 1;
        int breach = -1;
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            
            if(nums[end] < nums[end+1]){
                
                breach = end;
                break;
            }
            else{
                
                end --;
            }
        }
        if(breach == -1){
            
            swap(0, nums.length - 1, nums);
            return;
        }
        else{
          //  System.out.print(breach);
            int j = nums.length - 1;
            while(nums[breach] >= nums[j]){
                
                j --;
            }
            int temp = nums[breach];
            nums[breach] = nums[j];
            nums[j] = temp;
            
            swap(breach + 1, nums.length-1, nums);
        }
        
    }
    
    private void swap(int start, int end, int[] nums){
        
        while(start < end){
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}
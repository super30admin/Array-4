//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on leetcode: yes

class Solution {
    public void nextPermutation(int[] nums) {
        
        int peek_index=-1;
        int next_highest=-1;
        
        //first find the index from right where there is a peek down
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                peek_index = i;
                break;
            }
        }
        
        if(peek_index>=0){
            //find the next highest element from right
            for(int i=nums.length-1; i>peek_index; i--){
                if(nums[i]>nums[peek_index]){
                    next_highest = i;
                    swap(nums, peek_index, next_highest);
                    break;
                }
            }
        }
        
        reverse(nums,peek_index+1,nums.length-1);
        return;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

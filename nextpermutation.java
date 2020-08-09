//time:O(n)
//space:O(1)
//leetcode:yes

class Solution {
    public void nextPermutation(int[] nums) {
        //edge
        if(nums == null || nums.length == 0)return;
        
        //find the breach
        int i = nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        } 
        //reached breach point
        //find the digit place to be replaced with
        int j = nums.length-1;
        if(i >= 0){
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length - 1);
        
        
    }
    
    private void swap(int [] nums, int i, int j){
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
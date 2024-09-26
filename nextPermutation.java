//APPROACH: Iterate over the array from the second last element and find an element which is smaller than its immediate right. Once that element is found that's our action element. That's the element we want to replace. Now for finding the replacement element iterate from the last index and find an element which is smaller than our action element. Swap these two numbers and sort the remaining numbers on the right in acsending order.

//time complexity O(n) where n is the length of the array
//space complexity O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int i = nums.length - 2; int j = nums.length -1;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0){
            while(j > i && nums[j] <= nums[i]) j--;
            swap(nums, i, j);    
        }
        reverse(nums, i+1, nums.length -1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++; end--;            
        }
    }
}

//time O(n)
//space O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int actionIdx = findActionIdx(nums);
        if(actionIdx != -1) {
            int swapIdx = findSwapIdx(nums, actionIdx);
            swap(nums, actionIdx, swapIdx);        
        }
        reverse(nums, actionIdx+1, nums.length-1);
    }
    
    private int findActionIdx(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0) {
            if(nums[i] < nums[i+1]) {
                return i;
            }
            i--;
        }
        return -1;
    }
    
    private int findSwapIdx(int[] nums, int actionIdx) {
        int actionNum = nums[actionIdx];
        int i = nums.length - 1;
        while(i >= 0) {
            if(nums[i] > actionNum) {
                return i;
            }
            i--;
        }
        return -1;
    }
    
    private void swap(int[] nums, int actionIdx, int swapIdx) {
        int temp = nums[actionIdx];
        nums[actionIdx] = nums[swapIdx];
        nums[swapIdx] = temp;
    }
    
    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            swap(nums, left, right);
            left++; right--;
        }
    }
}

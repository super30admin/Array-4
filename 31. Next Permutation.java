// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: YES
// Any problem you faced while coding this: NO

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        //Step 1: Find the breach means[the element is smaller than the element to its right]
        int n = nums.length;
        int idx = -1;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }
        
        //Step 2: Find the element from the right side which is greater than this element
        if(idx != -1){
            for(int i = n - 1; i >= 0; i--){
                if(nums[i] > nums[idx]){
                    swap(nums, i, idx);
                    break;
                }
            }    
        }
        
        
        //Swap 3: Reverse the elements from idx + 1 to end i.e. n - 1
        reverse(nums, idx + 1, n - 1);
    }
    
    private void reverse(int[] nums, int left, int right){
        while(left <= right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
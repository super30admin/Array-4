// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int swapLocation = -1;
        int n = nums.length;
        
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                swapLocation = i - 1;
                break;
            }
        }
        
        if (swapLocation == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        int smallest = swapLocation + 1;
        for (int i = swapLocation + 1; i < n; i++) {
            if (nums[i] > nums[swapLocation]) {
                smallest = i;
            }
        }
        
        int temp = nums[swapLocation];
        nums[swapLocation] = nums[smallest];
        nums[smallest] = temp;
        
        reverse(nums, swapLocation + 1, n - 1);
        
    }
    
    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i++;
            j--;
        }
    }
}
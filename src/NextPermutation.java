// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 * Here, find the breach in the array where the ith element is lesser than the i+1th element.
 * swap the breached ith element with the element just greater than it.
 * reverse all the elements from i+1th element till the last element of the array.
 */
public class NextPermutation {
	public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        //find the breach
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //swap the next greater integer
        if(i >= 0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse
        reverse(nums, i+1, n-1);
    }
    
    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++; r--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

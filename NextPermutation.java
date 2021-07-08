// Time Complexity : O(n) where n is the number of elements
// Space Complexity : O(1) in place 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Start from the end, and keep on decreasig the ith pointer till you find a decreasing
number. Then move the jth pointer from the end till you find nums[j] greater than the nums[i]. Swap the digits. Reverse from i+1 till the end to get
the next greater permutation.The increasing order of digits become the decresing order of digits in the permutation.
*/
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){return;}
        int j = nums.length-1;
        int i;
        for(i = nums.length-2; i>=0; i--){
            if(nums[i+1] > nums[i]){                                                    // Move the ith pointer till decraesing element is found
                break;
            }
            }
        if(i>=0){                                                                   // If not a decreasing order
        while(j >=0 && nums[j] <= nums[i]){
            j--;                                                                    // Move the j pointer till it has greater value than nums[i]
        } 
            swap(nums, i,j);                                                            //Swap the digits
        }
        reverse(nums, i+1);                                                                 // Reverse the remaining digits from i+1
        }
    private void swap(int[] nums, int i, int j){                                                    // Standard Swap function
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums, int i){                                                        // Standard Reverse function
        int j = nums.length-1;
        while(i < j){
            swap(nums, i,j);
            i++;
            j--;
        }
    }
}
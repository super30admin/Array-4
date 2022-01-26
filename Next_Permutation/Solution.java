// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * For last 2nd last index, we search if there is any index i, such that nums[i] < nums[i+1].
 * If yes, we replace the number at index, i with immediate greater element than nums[i] lies between i+1 and end of array
 * Once, we have replaced, we reverse the elements from i+1 to end of array.
 * We do this because, next greater number will be formed, by replacing 1st smallest digit from right to left, by 2nd smallest digit from right to left
 * And after replacement, we want 1st smallest to come next to 2nd smallest digit
 * And since elements are decreasing order after index i, we reverse them all to form lexicographically next greater number
 * If we dont get breach at all, then we just reverse all the digits
*/


class Solution {
    public void nextPermutation(int[] nums) {
        int breach = -1;
        
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                breach = i;
                break;
            }
        }
        
        if(breach != -1){
            for(int i = nums.length-1; i > breach;i--){
                if(nums[i] > nums[breach]){
                    swap(nums, breach, i);
                    break;
                }
            }
        }
        
        reverse(nums, breach+1, nums.length-1);
        
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int first, int sec){
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
    }
}
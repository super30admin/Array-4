// Time Complexity : O(N), looping separately twice
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : After class solution


// Your code here along with comments explaining your approach
//determine the drop (lower number) from back
//loop to find the highest number as compared to nums[i] from back
//if i>=0, then swap the above two numbers and reverse from i+1
//else, just reverse

class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        int i = n-2;
        
        //loop to determine the drop (lower number) from back
        while(i>=0 && nums[i] >= nums[i+1]){
            System.out.println(nums[i] + " " + nums[i+1]);
            //if(i == -1) break;
            i--;
        }
        
        //loop to find the highest number as compared to nums[i] from back
        if(i >= 0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }            
            swap(nums, i, j);           
        }
        
         reverse(nums, i+1, n-1);
        
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
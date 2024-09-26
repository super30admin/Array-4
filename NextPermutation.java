// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 1. Find the breach from end where value is smaller
 2. Find the index to swap with breached index;
 3. Reverse the indexes after the breached index.
 */

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length==0) return;
        int i=nums.length-1;

        //step1-- find breach
        while(i>=1 && nums[i]<=nums[i-1] ){   
            i--;
        }
        //step2 -- find swappable index
        if(i>=1){
            int k= nums.length-1;
            for(k= nums.length-1;k>=0;k--){
                if(nums[k] > nums[i-1]){
                    swap(nums,k,i-1);
                    break;
                }
            }
            //step3  --reverse array from next to breached index
            reverse(nums, i);
        }
        //if no swap found --- ascending order
        else {
            Arrays.sort(nums);
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums,int i){
        int start =i; int end = nums.length-1;
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
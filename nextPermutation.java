// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0){
            return;
        }
        int i = nums.length-2;
        //1.Find breach
        while(i>=0 && nums[i]>=nums[i+1]){
           i--;
        }
        
        //2.Find the number to change
        if(i>=0){
            int j = nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        
        //3. Reverse to the right of breach
        reverse(nums, i+1, nums.length-1);
        
    }
    
    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    private void reverse(int[] nums, int left, int right){
        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
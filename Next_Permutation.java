// Time Complexity : O(n)+O(n) = O(n), Array is traversed maximum twice.
// Space Complexity : O(1), no extra space is used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <2)return;

        int y = nums.length - 2;
        while(y>=0 && (nums[y+1]<=nums[y])){
            y--;

        }
        if(y>=0){
            int x = nums.length - 1;
            while(nums[x]<= nums[y]){
                x--;
            }
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp;  
        }
    
            
        
        reverse(nums,y+1);
    }

    private void reverse(int[] nums, int start){
        int i =start; int j = nums.length - 1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

}
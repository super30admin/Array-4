// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void nextPermutation(int[] nums) {
        int swapi = -1;
        int swapj = nums.length-1;

        for(int i=nums.length-1;i>0;i--) {
            if(nums[i]>nums[i-1]) {
                swapi = i-1;
                break;
            }
        }
        if(swapi == -1) {
            int i=0,j=nums.length-1;
            while(i<j){
                swap(nums,i, j);
                i++;
                j--;
            }
            return;
        }

        for(int j = swapi+1;j<nums.length;j++) {
            if(nums[swapi] < nums[j]) {
                swapj = j;
            }
        }

        swap(nums,swapi, swapj);

        int i = swapi+1;
        int j = nums.length - 1;
        while(i<j){
            swap(nums,i, j);
            i++;
            j--;
        }
    }
    private void swap(int[] nums,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 
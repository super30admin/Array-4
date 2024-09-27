// Time Complexity :  O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode :Yes


//find the first break in descending order to construct the smallest possible number
//then find the swapable element if i >=0 or reverse the number
//finding the swappable number, find the lowest degree next greater element to nums[i]
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){//detect breach
            i--;
        }
        if(i >= 0){ // if breach happened, find the number
            int j = nums.length - 1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i ,j);
        }
        reverse(nums, i + 1);
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// 1 2 3
// 1 3 2 


// 3  2 1 
// 1 2 3
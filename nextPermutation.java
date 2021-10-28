// Time Complexity: O(3n)
// Space Complexity: O(1)
// Approach: Idea here is to use 3 steps as follows:
// find the breach by checking from right at which point the previous value is lesser than current value
// then identifying in the right sub array which is the first element from right which is greater than breach
// and swap it
// to find the next permutation, reverse the right subarray formed
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n==0) return;
        int i = n-2;
        while(i>=0 && nums[i+1]<=nums[i]) i--;
        if(i>=0){
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, n-1);
    }
    
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    
    public void swap(int[] nums, int num1Index, int num2Index){
        int temp = nums[num1Index];
        nums[num1Index] = nums[num2Index];
        nums[num2Index] = temp;
    }
}
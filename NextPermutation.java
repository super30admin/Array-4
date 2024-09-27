/*
brute force: is to find all possible permutations and check which is immediate 
greater than current. Time : exponential time(O(n!))


better approach is:
to iterate the array from back and find number which is small than its next.
i.e. nums[i] < nums[i-1]
This is the breach point. 
Next, swap the breached element with next greater element.
reverse all nums from i+1 to n-1
time complexity: O(n)
space complexity :O(1)

*/
class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)return;
        
        //first is find the breach
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        //then swap with immediate greater number
        if(i >= 0){
            int j = n-1;
            while(j >= 0 && nums[i] >= nums[j])j--;
            swap(nums,i,j);
        }
        
        reverse(nums,i+1,n-1);
    }
    private void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[]nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
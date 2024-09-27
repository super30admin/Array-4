//Time - O(n)
//Space - O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null) return ;
        int n = nums.length;
        int i = n-2;
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        //find j .. digit to replace i
        if(i>=0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse from i+1
        reverse(nums, i+1,n-1);
    }
    
    private void reverse(int[] arr , int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        if(nums[i]!=nums[j]){
            nums[i] = nums[i]+nums[j];
            nums[j] = nums[i]-nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}
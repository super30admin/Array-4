//tc: O(n) where n is length of input array
//sc: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        //find the index of number which is breach
        int n = nums.length;
        int i = n-2;
        
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        //System.out.println(i);
        if(i >= 0){
            //find the next max
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        //reverse
        reverse(nums, i+1, n-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i, j);
            i++; j--;
        }
    }
}
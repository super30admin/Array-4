//time - O(n), space - O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2) return;
        int i=nums.length-2;

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        int j = nums.length-1;

        if(i>=0){
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        reverse(nums, i+1, nums.length-1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

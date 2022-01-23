 import java.util.Arrays;

class Solution {
    //O(n) time constant space
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    private void reverse(int[] nums, int l , int r){
        while(l < r){
            swap(nums, l, r );
            l++; r--;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //o(n) time constant space
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            rSum = Math.max(rSum + num, num);
            maxSum = Math.max(maxSum, rSum);

        }
        return maxSum;
    }
    
    //o(n) time constant space
    private int arrayPairSum(int[] nums) {
        if(nums== null || nums.length == 0)return 0;
        Arrays.sort(nums); 
        int result = 0;
        for(int i = 0; i < nums.length; i= i+2){
            result += nums[i];
        }
        return result;
    }

    

}
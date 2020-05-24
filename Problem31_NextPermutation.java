/**
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */

class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length-2;

        while(i >=0 && nums[i+1] <= nums[i]){
            i--;
        }

        if(i >= 0){
            int j = nums.length-1;
            while(j >=0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] =  nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left){
        int right = nums.length-1;
        while(left < right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}

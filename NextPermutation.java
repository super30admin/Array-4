//time complexity : O(n) n = length of nums array
//space complexity : O(1)

class Solution {
    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length == 0)
            return;

        int n = nums.length;

        //find the breach
        int i = n-2;

        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }

        //breach occured before i became negative, find number just greater number to swap
        if(i>=0) {
            int j = n-1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //reverse from breach onwards
        reverse(nums, i+1, n-1);

    }

    private void reverse(int[] nums, int l, int r) {
        while(l<r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}

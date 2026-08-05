/**
 * Time Complexity:  O(n)  where n is length of nums
 * Space Complexity: O(1)
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-1;
        while(i>0 && nums[i-1] >= nums[i]){
            i--;
        }

        if(i==0){
            reverse(nums, i, n-1);
            return;
        }

        // At i-1, there is a number < nums[i]
        // Find a number immediately greater than the num at i-1
        int j = i;
        int num = nums[i-1];
        while(j < n && num < nums[j]){
            j++;
        }
        // number at j is less than num at nums[i-1]
        //Exhange the numbers at j-1 and i-1
        swap(nums, j-1, i-1);
        //Reverse all the numbers from n-1 to i
        reverse(nums, i, n-1);

    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++; r--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
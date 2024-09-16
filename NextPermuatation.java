// Time Complexity : O(n)
// Space Complexity : O(1) - No extra space as all reversals are in place
// Did this code successfully run on Leetcode : Yes

/*Approach : Intuition - To get a higher number at any index, we have to swap it with larger number from its right side**

        1. Find the digit / index to replace (operational index)- **current - O(n) -**
        2. Find the digit just greater than **current** no. to swap - **O(n)**
        3. As we need to have next permutation, reverse from operating index - **O(n)**

 */

public class NextPermuatation {

    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;

        //find operating index
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            //find no. to swap
            int j = n-1;
            while(nums[i] >= nums[j]){ // >= because if its same number, no point to swap
                j--;
            }
            swap(nums,i,j);
        }
        //reverse numns on right of breach
        reverse(nums,i+1, n-1);

    }

    private void reverse(int[]nums, int l, int r){
        while(l < r){
            swap(nums, l , r);
            l++;
            r--;
        }
    }

    private void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Approach : find the breach , find what to replace and reverse the rest of the numbers (because we are looking for just the next greatest)
// Time : O(n) +O(n) + O(n)
// Space : O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        // step 1 - find the breach
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        // stops at  i == -1 (-ve) if no breach implies we have the greatest number
        // step 2 : find what to replace
        int j = n-1;
        if(i>=0){ // if breach exists then i is +ve or zero
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        // step 3 : reverse the rest of the numbers from i+1 to end
        reverse(nums,i+1,n-1);
    }

    public void reverse(int[] nums , int l , int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    public void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
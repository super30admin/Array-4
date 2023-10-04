// TC = O(n)
// SC = O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        //1. Find the breach.
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //2. find j the element to swap.
        if(i != -1){
            int j = n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }

        //3. reverse
        reverse(nums, i+1, n-1);
    }
    private void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
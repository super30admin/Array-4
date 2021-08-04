// Time: O(n)
//Space: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) return;
        
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        if(i >= 0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }
    
    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums,l,r);
            l++;r--;
        }
    }
}
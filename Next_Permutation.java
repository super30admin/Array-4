// TC : O(n)
// SC : O(1)

class Solution {
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    private void reverse(int[] nums, int l, int r) {
        while(l <= r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n == 0 || nums == null || n == 1) return;
        int idx = -1;
        
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if(idx != -1) {
            for(int i = n - 1; i >= idx; i--) {
                if(nums[i] > nums[idx]) {
                    swap(nums, i, idx);
                    break;
                }
            }
        }
        
        reverse(nums, idx+1, n - 1);
    }
}

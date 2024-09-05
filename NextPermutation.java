//Time Complexity : O(3n)
//Space Complexity : O(1)
//Did this code run successfully on leetcode : Yes
//Have you faced any issue while coding this problem : No
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0) {
            int j = n-1;
            while(nums[i] >= nums[j]) j--;
            swap(nums, i, j);
        }
        reverse(nums,i+1,n-1);
    }

    private void reverse(int[] nums, int l, int r) {
        while(l < r) {
            swap(nums, l, r);
            l++;r--;
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
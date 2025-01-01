// Time complexity = O(n)
// Space complexity = O(1)

class Solution {
  public void nextPermutation(int[] nums) {
    if(nums == null || nums.length == 0) return;
    //1. Discover the breach
    int n = nums.length;
    int i = n-2;
    while(i>=0 && nums[i] >= nums[i+1]) i--;
    //2. Discover element just greater than element at i, swap
    if(i!=-1) {
      int j = n-1;
      while(j>i && nums[j] <= nums[i]) j--;
      swap(nums, i, j);
    }
    //3. Reverse from i+1 to end
    reverse(nums, i+1, n-1);
  }

  void reverse(int[] nums, int l, int r) {
    while(l<r) {
      swap(nums, l, r);
      l++;
      r--;
    }
  }

  void swap(int[] nums, int l, int r) {
    int temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
  }
}
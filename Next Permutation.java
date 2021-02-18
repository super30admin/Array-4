/*
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return 
        
        n = len(nums)
        
        # find number which is smaller than adjacent starting from right
        i = n - 2
        while i >=0 and nums[i] >= nums[i+1]:
            i -= 1
        
        # now check whether index is valid and find a number immediately greater than current 
        if i >= 0:
            j = n-1
            while j >= 0 and nums[j] <= nums[i]:
                j -= 1
            self.swap(nums, i, j)
        
        # reverse from i+1 index
        self.reverse(nums, i+1, n-1)
        
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1
*/

// Time - O(n)
// Space - O(1)
// Logic - first found the number which is smaller than its adjacent starting from right and then replaced it with number immediately greater 
// than it and then reversed starting from its next index till end            
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        
        int n = nums.length;
        
        int i = n-2;
        while (i>=0 && nums[i] >= nums[i+1]){
            i --;
        }
        
        if (i >= 0){
            int j = n-1;
            while (j>=0 && nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, n-1);
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int l, int r){
        while (l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
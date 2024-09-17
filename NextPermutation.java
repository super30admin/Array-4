// 31.
// time - O(n) with constant space
class Solution {
    public void nextPermutation(int[] nums) {
        //edge
        if(nums == null || nums.length == 0)
        {
            return;
        }
        
        //find the first right most index at which element is smaller than its next element
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        
        if(i == -1)
        {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        
        //find the right most element which is larger than element at i
        int j = nums.length - 1;
        while(j > i && nums[j] <= nums[i])
        {
            j--;
        }
        
        swap(nums, i, j); //swap elements at i and j
        reverse(nums, i + 1, nums.length - 1); //reverse sub array from i + 1 to end
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    
    private void reverse(int[] nums, int low, int high) {
        while(low < high)
        {
            swap(nums, low, high);
            low++;
            high--;
        }
        return;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
        	i--;
        }

        if(i >= 0) {
        	int j = n - 1;
        	while(nums[j] <= nums[i]) {
        		j--;
        	}
        	swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
    	int i = start, j = nums.length - 1;
    	while(i < j) {
    		swap(nums, i, j);
    		i++;
    		j--;
    	}
    }

    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
//Time complexity: O(N), where N is the length of nums array.
//Space complexity: O(1)

class Solution3 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i+1] <= nums[i]) {
            i--; 
        }
        
        if(i >= 0) {
            int j = n-1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        } 
        
        int left = i+1;
        int right = n-1;
        while(left <= right) {
            int temp = nums[left]; 
            nums[left++] = nums[right]; 
            nums[right--] = temp; 
        }
    }
}
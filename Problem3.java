//Time -> O(n)
//Space -> O(1)


class Problem3 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return; 
        int n = nums.length; 
        int i = n - 2; 
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1; 
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, n- 1);
    }
    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
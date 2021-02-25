class NextPermutation {

    /*
      Time : O(N)
      Space : O(N)
      Leetcode : YES
    */
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        //1. find the breach
        int breachIndex = n - 2;
        while(breachIndex >=0 && nums[breachIndex] >= nums[breachIndex + 1]){
            breachIndex--;
        }
        //2. swap with next big integer
        if(breachIndex >= 0){
            int j = n - 1;
            while(nums[breachIndex] >= nums[j]){
                j--;
            }
            
            swap(nums, breachIndex, j);
        }
        
        reverse(nums, breachIndex + 1, n - 1);
        
    }
    
    private void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

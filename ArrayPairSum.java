class ArrayPairSum {

    /*
        Time : O(n lg n) | sorting
        space : O(1) | Assuming sorting is in place
    */
    
    /*
      Approach
      1. We want to take minimum from each pair and still maximise the sum, hence
      2. Difference btwn two items of each pair has to be minimum, 
      3. So sort the array and take minimum number from pair
    */
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i< nums.length - 1; i = i+2){
            sum += nums[i];
        }  
        return sum;
    }
}

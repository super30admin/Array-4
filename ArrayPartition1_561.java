class Solution {
    // Time Complexity: O(nlogn) 
    // Space Complexity: O(1)
    
    // Obs: To get max sum, difference b/w two should be minimum
    //     ==> (1,8) & (2,7) => 3
    //     ==> (1,2) & (7,8) => 8 => (1,2,7,8) ==> sort
    
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        int min;
        for(int i = 0; i < nums.length-1; i=i+2){
            sum += nums[i];
        }
        return sum;
        
    }
}
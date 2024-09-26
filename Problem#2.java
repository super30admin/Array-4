 // MAximum Subarray  #LC 53   #S30 123 

 class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int rmax = nums[0],  max = nums[0];
        int start = 0, end = 0, currStart = 0;
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > rmax + nums[i]) {
                rmax = nums[i];
                currStart = i;
            }
            else {
                rmax = rmax + nums[i];
            }
            if(rmax > max) {
                max = rmax;
                start = currStart;
                end = i;
            }
        }
        
        return max;
    }
}

/*
Complexity Analysis
Time complexity : 
O(N) since it's one pass along the array.

Space complexity : 
O(1), since it's a constant space solution.

*/

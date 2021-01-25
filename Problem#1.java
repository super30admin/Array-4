// Array partition -1   #LC 561  #S30  122

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0; i < nums.length; i+=2 ) {
            sum += nums[i];
        }        
        
        return sum;
    }
}


/*
Complexity Analysis

Time complexity : 
O(NlogN). Sorting takes 
O(NlogN) time. We iterate over the array only once.

Space complexity : 
O(N) or 
O(logN)
*/

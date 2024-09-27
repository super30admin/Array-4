    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/array-partition-i/
    Time Complexity for operators : o(n) .. n is the length of the array
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. 
                    A) Sort the array.
                    B) Now, you will get the answer for the position 0, 2, 4..
                    C) just sum the values of that indices.
                    D) return sum.
    */  

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int sum = 0;
        for(int x = 0; x< nums.length - 1; x +=2){
            sum += nums[x];
        }
        return sum;
    }
}
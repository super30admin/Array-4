/*
Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        //base
        if(nums.length == 0) {
            return 0;
        }

        //variables
        int total = 0;

        //logic
        Arrays.sort(nums);
        
        for(int i=0; i < nums.length; i=i+2) {
            total = total + nums[i];
        }

        return total;
    }
}
// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        // return 0 if input array is null or empty
        if(nums == null || nums.length == 0) return 0;
        // sort the input array
        Arrays.sort(nums);
        int n = nums.length;
        // intialize left and right pointers
        int l = 0;
        int r = 1;
        int sum = 0;
        // iterate through the array and keep updating the sum
        while(r < n){
            sum += Math.min(nums[l], nums[r]);
            l += 2;
            r += 2;
        }
        return sum;
    }
}
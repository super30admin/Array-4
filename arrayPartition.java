
// Time Complexity : O( n LogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0,i =0;
        while(i < nums.length){
            sum += nums[i];
            i += 2;;
        }
        return sum;
    }
}
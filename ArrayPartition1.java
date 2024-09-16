// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
//Sort the array, and it will form pairs with min distance
//Return every other val starting from 0 to return pair sum

class Solution {
    public int arrayPairSum(int[] nums) {

        if(nums == null) return 0;

        Arrays.sort(nums);
        int sum = 0;
        int i = 0;
        while(i < nums.length) {
            sum += nums[i];
            i = i+2;
        }
        return sum;
    }
}

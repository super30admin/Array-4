// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    1. Sort the array and take the alternate lower pair number.
    2. For ex first pair will be (arr[0], arr[1]) so add arr[0] to the result array.

*/

// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        int[] numsTemp = nums;
        Arrays.sort(numsTemp);
        for(int i=0;i<numsTemp.length;i+=2) {
            sum += numsTemp[i];
        }
        return sum;
    }
}

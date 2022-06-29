// Time Complexity : O(n) n no.of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
if we sort the array for every two consective elements the sum of the  min of each pair gives max sum

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length;i+=2){
            result=result+nums[i];
        }
        return result;
    }
}
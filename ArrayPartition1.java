// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The sum of min pair would always be max if we club least valued 
// numbers together and max valued nos. together
// Hence we sort the array and club the 1st & 2nd, 3rd & 4th ... like that
// min of these pairs would always be first element of the pair, we can directly take sum of these
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}
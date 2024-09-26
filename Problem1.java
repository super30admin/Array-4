// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
/**  The best pairs can be formed when the array is sorted and we take two consecutive numbers as pairs
     Alternate numbers in the sorted array are the minimum of the pairs hence we add them and return sum **/
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
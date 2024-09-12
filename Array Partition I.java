// 561. Array Partition I
// Time Complexity : O(nlog(n)) // Arrays.sort
// Space Complexity : O(1) where h is height of the tree
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //Sort firt // nlog(n)
        int sum = 0;
        for(int i=0; i<nums.length; i+=2)
        {
            sum += nums[i]; // Sum of min of every pair reduces the distance between the elements resulting max
        }
        return sum;
    }
}
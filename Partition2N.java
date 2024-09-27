// Time Complexity : O(nlog n) where n is the number of elements
// Space Complexity : O(1) in place 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Sort the Array. Then you get pairs of number such that the minimum numbers are
on one side and the maximum numbers on other side. We need minimum number pairs with max sum. So from the start we can take a number at every
alternate position that will be minimum number since the array is in ascending order. Pairs are given as a1,b1 and hence the neighboring elements
would be a part of the pair.
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){return 0;}
        Arrays.sort(nums);                                                                  // Sort the array
        int sum=0;
        for(int i = 0; i < nums.length; i+=2){
            sum+=nums[i];                                                               // Take every alternate number sum as they are min number of the pairs
        }
        return sum;
    }
}
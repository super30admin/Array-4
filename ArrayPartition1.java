//https://leetcode.com/problems/array-partition-i/
/*
Time: O(n) where n=nums.length
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort and take all alternate elements

        int result = 0;

        for (int i = 0; i < nums.length; i += 2)
            result += nums[i];

        return result;
    }

}

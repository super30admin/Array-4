/*
561. Array Partition
Ran on leetcode: Yes
TC: O(nlogn)
SC: O(1)
Sort the array to minimize the distance between the elements and  add up the elements on even number index to add the smallest element in pairs
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        int numsLen = nums.length;
        Arrays.sort(nums); // sort the array to minimize the distance between the elements
        int result = 0;
        for(int i = 0; i < numsLen - 1; i += 2){ // Add up the even number elements to add the smallest element in pairs
            result += nums[i];
        }
        return result;
    }
}
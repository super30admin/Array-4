// In this problem we are trying to sort the array first, because pairing the min element with max element or any larger element
// will make us loose the larger element. So we should pair the min element with the next min element in array and sorting will
// help us place both next to each other. Then simply take the alternate elements and add.

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public int arrayPairSum(int[] nums) {
        // Base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Sort
        Arrays.sort(nums);
        // Declare total
        int total = 0;
        // Take the alternate and add in total
        for (int i = 0; i < nums.length; i = i + 2) {
            total = total + nums[i];
        }
        // Return total
        return total;
    }
}